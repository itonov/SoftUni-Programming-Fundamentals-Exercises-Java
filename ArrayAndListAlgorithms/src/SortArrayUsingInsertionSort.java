import java.util.Scanner;

public class SortArrayUsingInsertionSort {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] inputNumbers = console.nextLine().split(" ");
        int[] numbers = new int[inputNumbers.length];

        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentIndex = i + 1;

            while (currentIndex > 0){

                if (numbers[currentIndex] < numbers[currentIndex - 1]){
                    int temp = numbers[currentIndex];
                    numbers[currentIndex] = numbers[currentIndex - 1];
                    numbers[currentIndex - 1] = temp;
                }

                currentIndex--;
            }
        }

        for (int number :numbers) {
            System.out.print(number + " ");
        }
    }
}
