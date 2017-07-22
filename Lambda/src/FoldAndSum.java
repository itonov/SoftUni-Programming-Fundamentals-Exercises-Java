import java.util.*;

public class FoldAndSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputString = Arrays.asList(console.nextLine().split(" "));
        LinkedList<Integer> numbers = new LinkedList<>();

        for (String word : inputString) {
            numbers.add(Integer.parseInt(word));
        }

        int k = numbers.size() / 4;

        LinkedList<Integer> upperRow = new LinkedList<>();
        LinkedList<Integer> lowerRow = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            upperRow.add(numbers.get(i));
        }

        Collections.reverse(upperRow);
        Collections.reverse(numbers);

        for (int i = 0; i < k; i++) {
            upperRow.add(numbers.get(i));
        }

        Collections.reverse(numbers);

        for (int i = k; i < numbers.size() - k; i++) {
            lowerRow.add(numbers.get(i));
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < upperRow.size(); i++) {
            result.add(upperRow.get(i) + lowerRow.get(i));
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
