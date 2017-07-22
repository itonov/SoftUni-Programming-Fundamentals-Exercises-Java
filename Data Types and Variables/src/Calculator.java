import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstOperand = Integer.parseInt(console.nextLine());
        String operator = console.nextLine();
        int secondOperand = Integer.parseInt(console.nextLine());
        int result = 0;
        switch (operator){
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;

        }
        System.out.printf("%d %s %d = %d", firstOperand, operator, secondOperand, result );
    }
}
