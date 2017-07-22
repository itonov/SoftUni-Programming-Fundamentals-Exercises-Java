import java.util.*;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputNumbers = Arrays.asList(console.nextLine().split(" "));
        List<Integer> numbers = new ArrayList<>();

        for (String word:inputNumbers) {
            numbers.add(Integer.parseInt(word));
        }

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {

            if (i + 1 == numbers.size()){
                System.out.print(numbers.get(i));
            }
            else {
                System.out.print(numbers.get(i) + " <= ");
            }
        }

    }
}
