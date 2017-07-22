import java.util.Scanner;

public class CountofOddNumbersinArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] numbers = console.nextLine().split(" ");

        int[] numbersToCheck = new int[numbers.length];
        int oddCount = 0;

        for (int i = 0; i < numbersToCheck.length; i++) {
            numbersToCheck[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i < numbersToCheck.length; i++) {
            if (numbersToCheck[i] % 2 == 1 || numbersToCheck[i] % 2 == -1){
                oddCount++;
            }
        }

        System.out.println(oddCount);

    }
}
