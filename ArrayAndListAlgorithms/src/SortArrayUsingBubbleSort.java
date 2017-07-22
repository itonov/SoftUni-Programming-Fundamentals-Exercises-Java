import java.util.Scanner;

public class SortArrayUsingBubbleSort {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] inputNumbers = console.nextLine().split(" ");
        int[] numbers = new int[inputNumbers.length];

        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        boolean swapped = false;

        do {
            swapped = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                int currentElement = i;
                int nextElement = i + 1;

                if (numbers[currentElement] > numbers[nextElement]){
                    int temp = numbers[currentElement];
                    numbers[currentElement] = numbers[nextElement];
                    numbers[nextElement] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        for (int number :numbers) {
            System.out.print(number + " ");
        }
    }
}
