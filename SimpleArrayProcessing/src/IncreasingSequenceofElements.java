import java.util.Scanner;

public class IncreasingSequenceofElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] numbers = console.nextLine().split(" ");
        int[] numbersToCheck = new int[numbers.length];

        for (int i = 0; i < numbersToCheck.length; i++) {
            numbersToCheck[i] = Integer.parseInt(numbers[i]);
        }

        int increasingCount = 0;

        for (int i = 0; i < numbersToCheck.length - 1; i++) {
            if (numbersToCheck[i] < numbersToCheck[i + 1]){
                increasingCount ++;
            }
        }

        if (increasingCount == numbersToCheck.length - 1){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
