import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double number = Double.parseDouble(console.nextLine());
        int power = Integer.parseInt(console.nextLine());

        System.out.println(RaiseToPower(number, power));
    }

    public static double RaiseToPower(double number, int power) {
        double result = 1;

        for (int i = 0; i < power; i++) {
            result *= number;
        }

        return result;
    }
}
