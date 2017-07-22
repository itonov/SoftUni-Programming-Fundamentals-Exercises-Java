import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayContainsElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputNumbers = Arrays.asList(console.nextLine().split(" "));
        List<Integer> numbers = new ArrayList<>();

        for (String word :inputNumbers) {
            numbers.add(Integer.parseInt(word));
        }

        int n = Integer.parseInt(console.nextLine());

        boolean isFound = false;

        for (int number :numbers) {

            if (n == number){
                isFound = true;
                break;
            }
        }

        if (isFound){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}
