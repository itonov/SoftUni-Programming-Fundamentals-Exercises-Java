import java.util.*;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputNumbers = Arrays.asList(console.nextLine().split(" "));
        List<Integer> numbers = new ArrayList<>();

        for (String number:inputNumbers) {
            numbers.add(Integer.parseInt(number));
        }

        int count = 1;

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size() - 1; i++) {

            if (numbers.get(i).equals(numbers.get(i + 1))){
                count++;
            }
            else {
                System.out.println(numbers.get(i) + " -> " + count);
                count = 1;
            }
        }

        System.out.println(numbers.get(numbers.size() - 1) + " -> " + count);

    }
}
