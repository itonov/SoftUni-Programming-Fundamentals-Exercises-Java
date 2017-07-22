import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntegerInsertion {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputNumbers = Arrays.asList(console.nextLine().split(" "));

        List<Integer> numbers = new ArrayList<>();

        for (String word: inputNumbers) {
            numbers.add(Integer.parseInt(word));
        }

        String inputLine = console.nextLine();

        while (!inputLine.equals("end")){
            int currentNumber = Integer.parseInt(inputLine);

            numbers.add(CalculateIndex(currentNumber), currentNumber);

            inputLine = console.nextLine();
        }

        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }

    private static int CalculateIndex(int number) {
        int firstDigit = 0;

        while (number > 0){
            firstDigit = number % 10;
            number /= 10;
        }

        return firstDigit;
    }

}
