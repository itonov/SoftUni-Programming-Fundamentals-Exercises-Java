import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesandReverse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> integersInput = Arrays.asList(console.nextLine().split(" "));
        List<Integer> numbers = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (String number:integersInput) {
            numbers.add(Integer.parseInt(number));
        }

        for (int number:numbers) {
            result.add(number);
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) < 0){
                result.remove(numbers.get(i));
            }
        }

        if (numbers.get(numbers.size() - 1) < 0){
            result.remove(result.size() - 1);
        }

        if (result.isEmpty()){
            System.out.println("empty");
        }
        else {
            for (int i = result.size() - 1; i >= 0; i--) {
                System.out.print(result.get(i) + " ");
            }
        }
    }
}
