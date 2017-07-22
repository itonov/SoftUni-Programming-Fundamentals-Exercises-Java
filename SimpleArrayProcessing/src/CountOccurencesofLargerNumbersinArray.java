import java.util.Scanner;

public class CountOccurencesofLargerNumbersinArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] numbers = console.nextLine().split(" ");
        double[] numbersToCheck = new double[numbers.length];

        for (int i = 0; i < numbersToCheck.length; i++) {
            numbersToCheck[i] = Double.parseDouble(numbers[i]);
        }

        double numberToFind = Double.parseDouble(console.nextLine());
        int occurencesCount = 0;

        for (double number: numbersToCheck) {
            if (number > numberToFind){
                occurencesCount ++;
            }
        }

        System.out.println(occurencesCount);
    }
}
