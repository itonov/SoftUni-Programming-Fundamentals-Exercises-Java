import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputNumbers = Arrays.asList(console.nextLine().split(" "));
        List<Double> numbers = new ArrayList<>();

        for (int i = 0; i < inputNumbers.size(); i++) {
            numbers.add(Double.parseDouble(inputNumbers.get(i)));
        }

        for (int i = 0; i < numbers.size() - 1; i++) {

            while (i < numbers.size() - 1) {

                if (numbers.get(i).equals(numbers.get(i + 1))) {

                    double sum = numbers.get(i) + numbers.get(i + 1);

                    numbers.remove(numbers.get(i + 1));
                    numbers.set(i, sum);

                    if (i > 0){
                        i--;
                    }
                }
                else {
                    i++;
                }
            }
        }

        DecimalFormat df = new DecimalFormat("##.##");

        for (int i = 0; i < numbers.size(); i++) {

            System.out.print(df.format(numbers.get(i)) + " ");
        }
    }
}