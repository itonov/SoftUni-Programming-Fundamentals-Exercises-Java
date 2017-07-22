import java.text.DecimalFormat;
import java.util.Scanner;

public class MultiplyanArrayofDoubles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] numbers = console.nextLine().split(" ");
        double p = Double.parseDouble(console.nextLine());

        double[] numersToMultiply = new double[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numersToMultiply[i] = Double.parseDouble(numbers[i]);
        }

        for (int i = 0; i < numersToMultiply.length; i++) {
            numersToMultiply[i] *= p;
        }

        DecimalFormat df = new DecimalFormat("##.##");

        for (int i = 0; i < numersToMultiply.length; i++) {
            System.out.print(df.format(numersToMultiply[i]) + " ");
        }
    }
}
