import java.util.Scanner;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] inputNumbers = console.nextLine().split(" ");
        int[] numbers = new int[inputNumbers.length];

        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        for (int i = 0; i < numbers.length / 2; i++) {
            int leftIndex = i;
            int rightIndex = numbers.length - 1 - i;

            int tempNumber = numbers[leftIndex];
            numbers[leftIndex] = numbers[rightIndex];
            numbers[rightIndex] = tempNumber;
        }

        for (int number :numbers) {
            System.out.print(number + " ");
        }
    }
}
