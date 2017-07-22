import java.util.*;

public class UnunionLists {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputList = Arrays.asList(console.nextLine().split(" "));
        List<Integer> primalList = ConvertToIntegerList(inputList);

        int lines = Integer.parseInt(console.nextLine());

        for (int i = 0; i < lines; i++) {
            List<String> inputLine = Arrays.asList(console.nextLine().split(" "));
            List<Integer> inputNumbers = ConvertToIntegerList(inputLine);

            for (int j = 0; j < inputNumbers.size(); j++) {

                    if (primalList.contains(inputNumbers.get(j))){

                        primalList.remove(inputNumbers.get(j));
                    }
                    else {
                        primalList.add(inputNumbers.get(j));
                    }
            }
        }

        Collections.sort(primalList);

        for (int number:primalList) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> ConvertToIntegerList(List<String> text) {
        List<Integer> numbers = new ArrayList<>();

        for (String word:text) {
            numbers.add(Integer.parseInt(word));
        }

        return numbers;
    }
}
