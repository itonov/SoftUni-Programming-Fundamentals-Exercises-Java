import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] inputNumbers = console.nextLine().split(" ");
        int[] numbers = new int[inputNumbers.length];

        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        int smallestNumber = Integer.MAX_VALUE;

        for (int number :numbers) {

            if (number < smallestNumber){
                smallestNumber = number;
            }
        }

        System.out.println(smallestNumber);
    }
}
