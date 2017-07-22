import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DistinctList {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputNumbers = Arrays.asList(console.nextLine().split(" "));

        List<Integer> numbers = new ArrayList<>();

        for (String word:inputNumbers) {
            numbers.add(Integer.parseInt(word));
        }

        for (int i = 0; i < numbers.size(); i++) {
            int numberToCheck = numbers.get(i);

            for (int j = 0; j < numbers.size(); j++) {

                if (numberToCheck == numbers.get(j)){
                    numbers.remove(numbers.get(j));
                    j--;
                }
            }

            numbers.add(i, numberToCheck);
            
        }

        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}
