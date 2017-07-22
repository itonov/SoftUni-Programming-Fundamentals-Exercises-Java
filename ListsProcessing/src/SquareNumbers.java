import java.util.*;

public class SquareNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputNumbers = Arrays.asList(console.nextLine().split(" "));
        List<Integer> numbers = new ArrayList<>();
        List<Integer> squareNumbers = new ArrayList<>();

        for (String word:inputNumbers) {
            numbers.add(Integer.parseInt(word));
        }

        for (int number:numbers) {
            int squaredNumber = (int) Math.sqrt(number);

            if (squaredNumber * squaredNumber == number){
                squareNumbers.add(number);
            }

        }

        Collections.sort(squareNumbers);
        Collections.reverse(squareNumbers);

        for (int number:squareNumbers) {
            System.out.print(number + " ");
        }
    }
}
