import java.util.Scanner;

public class SignofIntegerNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        PrintSign(n);
    }

    public static void PrintSign(int number){
        if (number > 0){
            System.out.printf("The number %d is positive.", number );
        }
        else if (number < 0){
            System.out.printf("The number %d is negative.", number);
        }
        else {
            System.out.printf("The number %d is zero.", number);
        }
    }
}
