import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SumMinMaxAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(console.nextLine());
        }

        int sum = IntStream.of(numbers).sum();
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        double average = IntStream.of(numbers).average().getAsDouble();

        System.out.println("Sum = " + sum);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Average = " + average);
    }
}
