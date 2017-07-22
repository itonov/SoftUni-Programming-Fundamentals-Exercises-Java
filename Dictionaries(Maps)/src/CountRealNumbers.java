import java.text.DecimalFormat;
import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputNumbers = Arrays.asList(console.nextLine().split(" "));
        List<Double> numbersToCheck = new ArrayList<>();

        for (String word : inputNumbers) {
            numbersToCheck.add(Double.parseDouble(word));
        }

        SortedMap<Double, Integer> numbersCount = new TreeMap<>();

        for (double number : numbersToCheck) {
            if (!numbersCount.containsKey(number)){
                numbersCount.put(number, 0);
            }

            numbersCount.put(number, numbersCount.get(number) + 1);
        }

        DecimalFormat df = new DecimalFormat("##.##");

        for (Map.Entry<Double, Integer> kvp : numbersCount.entrySet()) {
            double key = kvp.getKey();
            int value = kvp.getValue();

            System.out.println(df.format(key) + " -> " + value);
        }
    }
}
