import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String value = console.nextLine();

        switch (value){
            case "int":
                int firstNumber = Integer.parseInt(console.nextLine());
                int secondNumber = Integer.parseInt(console.nextLine());

                System.out.println(GetMax(firstNumber, secondNumber));
                break;
            case "char":
                char firstChar = console.next().charAt(0);
                char secondChar = console.next().charAt(0);

                System.out.println(GetMax(firstChar, secondChar));
                break;
            case "string":
                String firstStr = console.nextLine();
                String secondStr = console.nextLine();

                System.out.println(GetMax(firstStr, secondStr));
                break;
        }
    }

    public static int GetMax(int first, int second){
        if (first > second){
            return first;
        }

        return second;
    }

    public static char GetMax(char first, char second){
        if (first > second){
            return first;
        }

        return second;
    }

    public static String GetMax(String first, String second){

        if (first.compareTo(second) >= 0){
            return first;
        }

        return second;
    }
}
