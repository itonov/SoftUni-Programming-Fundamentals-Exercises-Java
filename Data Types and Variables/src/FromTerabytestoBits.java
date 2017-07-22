import java.util.Scanner;

public class FromTerabytestoBits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double n = Double.parseDouble(console.nextLine());
        System.out.println((long) (n * 1024 * 1024 * 1024 * 1024 * 8));
    }
}
