import java.util.Scanner;

public class ArrayElementsEqualtoTheirIndex {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] numbers = console.nextLine().split(" ");
        int[] numbersToCheck = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbersToCheck[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i < numbersToCheck.length; i++) {
            if (numbersToCheck[i] == i){
                System.out.print(i + " ");
            }
        }
    }
}
