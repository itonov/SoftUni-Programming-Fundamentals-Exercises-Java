import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LargestNElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputNumbers = Arrays.asList(console.nextLine().split(" "));
        List<Integer> numbers = new ArrayList<>();

        for (String number : inputNumbers) {
            numbers.add(Integer.parseInt(number));
        }

        int n = Integer.parseInt(console.nextLine());

        for (int i = numbers.size() - 1; i > 0; i--) {
            int currentIndex = i - 1;

            while (currentIndex < numbers.size() - 1){

                if (numbers.get(currentIndex) < numbers.get(currentIndex + 1)){
                    int temp = numbers.get(currentIndex);
                    numbers.set(currentIndex, numbers.get(currentIndex + 1));
                    numbers.set(currentIndex + 1, temp);
                }

                currentIndex++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
