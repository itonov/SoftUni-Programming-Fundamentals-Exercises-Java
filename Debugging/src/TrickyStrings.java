import java.util.Scanner;

public class TrickyStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String delimiter = console.nextLine();
        int numberOfStrings = Integer.parseInt(console.nextLine());
        String result = "";
        String currentString = "";

        for (int i = 0; i < numberOfStrings; i++) {
            currentString = console.nextLine();
            if (i + 1 == numberOfStrings){
                result += currentString;
            }
            else {
                result += currentString + delimiter;
            }
        }

        System.out.println(result);
    }
}
