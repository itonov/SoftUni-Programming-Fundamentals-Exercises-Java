import java.util.Scanner;

public class IncrementVariable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int overflowTimes = number / 256;
        int remaining = number -(overflowTimes * 256);
        System.out.println(remaining);
        System.out.printf("Overflowed %d times", overflowTimes);
    }
}
