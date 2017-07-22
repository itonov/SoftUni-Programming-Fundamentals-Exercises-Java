import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UserLogins {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String inputUserPass = console.nextLine();

        Map<String, String> userPassPairs = new LinkedHashMap<>();

        while (!inputUserPass.equals("login")){
            String[] tokens = inputUserPass.split(" ");
            String username = tokens[0];
            String password = tokens[tokens.length - 1];

            if (!userPassPairs.containsKey(username)){
                userPassPairs.put(username, "");
            }

            userPassPairs.put(username, password);

            inputUserPass = console.nextLine();
        }

        int unsuccessfulLoginsCount = 0;
        inputUserPass = console.nextLine();

        while (!inputUserPass.equals("end")){
            String[] tokens = inputUserPass.split(" ");
            String username = tokens[0];
            String password = tokens[tokens.length - 1];

            if (userPassPairs.containsKey(username) && userPassPairs.get(username).equals(password)){
                System.out.println(username + ": logged in successfully");
            }
            else {
                System.out.println(username + ": login failed");
                unsuccessfulLoginsCount++;
            }

            inputUserPass = console.nextLine();
        }

        System.out.println("unsuccessful login attempts: " + unsuccessfulLoginsCount);
    }
}
