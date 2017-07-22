import java.util.Scanner;

public class CountofGivenElementinArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] numbers = console.nextLine().split(" ");

        int[] numbersToCheck = new int[numbers.length];

        for (int i = 0; i < numbersToCheck.length; i++) {
            numbersToCheck[i] = Integer.parseInt(numbers[i]);
        }

        int numberToFind = Integer.parseInt(console.nextLine());
        int count = 0;

        for (int number: numbersToCheck) {
            if (number == numberToFind){
                count ++;
            }
        }

        System.out.println(count);
    }
}
