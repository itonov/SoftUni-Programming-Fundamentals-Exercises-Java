import java.util.Scanner;

public class IntegerToBase {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());
        int toBase = Integer.parseInt(console.nextLine());

        System.out.println(IntegerToBase(number, toBase));
    }

    public static String IntegerToBase(int number, int base){
        String result = "";

        while (number > 0){
            int remainder = number % base;
            result = remainder + result;
            number /= base;
        }
        return result;
    }
}
