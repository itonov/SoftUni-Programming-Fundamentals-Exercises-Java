import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FlipListSides {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputIntegers = Arrays.asList(console.nextLine().split(" "));
        List<Integer> numbers = new ArrayList<>();

        for (String integer:inputIntegers) {
            numbers.add(Integer.parseInt(integer));
        }

        List<Integer> flippedNumbers = new ArrayList<>();

        flippedNumbers.add(numbers.get(0));

        for (int i = numbers.size()- 2; i > 0; i--) {
            flippedNumbers.add(numbers.get(i));
        }

        flippedNumbers.add(numbers.get(numbers.size() - 1));

        for (int number: flippedNumbers) {
            System.out.print(number + " ");
        }
    }
}
