import java.util.*;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputNumbers = Arrays.asList(console.nextLine().split(" "));
        List<Integer> numbers = new ArrayList<>();

        for (String num : inputNumbers) {
            numbers.add(Integer.parseInt(num));
        }

        Collections.sort(numbers, Collections.reverseOrder());

        for (int i = 0; i < Math.min(numbers.size(), 3); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
