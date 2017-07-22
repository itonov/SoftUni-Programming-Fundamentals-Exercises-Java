import java.util.Scanner;

public class SmallestElementinArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] numbers = console.nextLine().split(" ");

        int[] numbersToCompare = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbersToCompare[i] = Integer.parseInt(numbers[i]);
        }

        int smallestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < numbersToCompare.length; i++) {
            if (smallestNumber > numbersToCompare[i]){
                smallestNumber = numbersToCompare[i];
            }
        }

        System.out.println(smallestNumber);
    }
}
