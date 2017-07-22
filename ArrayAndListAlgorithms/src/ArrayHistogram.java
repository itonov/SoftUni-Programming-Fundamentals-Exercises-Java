import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayHistogram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] inputWords = console.nextLine().split(" ");

        List<String> words = new ArrayList<>();
        List<Integer> occurances = new ArrayList<>();

        for (int i = 0; i < inputWords.length; i++) {
            if (!words.contains(inputWords[i])){
                words.add(inputWords[i]);
                occurances.add(1);
            }
            else {
                for (int j = 0; j < words.size(); j++) {
                    if (inputWords[i].equals(words.get(j))){
                        occurances.set(j, occurances.get(j) + 1);
                        break;
                    }
                }
            }
        }

        boolean swapped = false;

        do {
            swapped = false;

            for (int i = 0; i < occurances.size() - 1; i++) {
                int currentNumber = occurances.get(i);
                int nextNumber = occurances.get(i + 1);

                if (currentNumber < nextNumber){
                    occurances.set(i, nextNumber);
                    occurances.set(i + 1, currentNumber);

                    String temp = words.get(i);
                    words.set(i, words.get(i + 1));
                    words.set(i + 1, temp);

                    swapped = true;
                }
            }
        } while (swapped);

        for (int i = 0; i < occurances.size(); i++) {
            double occurancePercentage = (occurances.get(i) * inputWords.length) / 100;
            System.out.printf("%s -> %d times (%.2f", words.get(i), occurances.get(i), occurancePercentage);
            System.out.print("%)");
            System.out.println();
        }
    }
}
