import java.util.Scanner;

public class Notifications {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int lines = Integer.parseInt(console.nextLine());
        String result = "";

        for (int i = 0; i < lines; i++) {
            result = console.nextLine();

            if(result.equals("success")) {
                String operation = console.nextLine();
                String message = console.nextLine();
                Success(operation, message);
            }
            else if(result.equals("error")){
                String operation = console.nextLine();
                int errorCode = Integer.parseInt(console.nextLine());
                Error(operation, errorCode);
            }

        }
    }

    public static void Success(String operation, String message){
        System.out.println("Successfully executed " + operation + ".");
        System.out.println("==============================");
        System.out.println("Message: " + message + ".");
    }

    public static void Error(String error, int errorCode){
        System.out.println("Error: Failed to execute " + error + ".");
        System.out.println("==============================");
        System.out.println("Error Code: " + errorCode + ".");
        if(errorCode > 0){
            System.out.println("Reason: Invalid Client Data.");
        }
        else if(errorCode < 0){
            System.out.println("Reason: Internal System Failure.");
        }
    }
}
