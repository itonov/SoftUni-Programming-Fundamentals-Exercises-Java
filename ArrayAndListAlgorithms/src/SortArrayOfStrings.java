import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortArrayOfStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> wordsToSort = Arrays.asList(console.nextLine().split(" "));

        boolean swapped = false;

        do {
            swapped = false;

            for (int i = 0; i < wordsToSort.size() - 1; i++) {
                String currentElement = wordsToSort.get(i);
                String nextElement = wordsToSort.get(i + 1);

                if (currentElement.compareTo(nextElement) > 0){
                    wordsToSort.set(i, nextElement);
                    wordsToSort.set(i + 1, currentElement);
                    swapped = true;
                }
            }
        } while (swapped);

        for (String word : wordsToSort) {
            System.out.print(word + " ");
        }
    }
}
