import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Winecraft {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputText = Arrays.asList(console.nextLine().split(" "));
        List<Integer> grapes = new ArrayList<>();

        for (String word: inputText) {
            grapes.add(Integer.parseInt(word));
        }

        int growthDays = Integer.parseInt(console.nextLine());

        for (int n = 0; n < growthDays; n++){
            IncrementAllGrapes(grapes);

            for (int i = 0; i < grapes.size(); i++) {
                boolean isFirstElement = i == 0;
                boolean isLastElement = i == grapes.size() - 1;

                if (!isFirstElement && !isLastElement){
                    int previousIndex = i - 1;
                    int nextIndex = i + 1;

                    boolean isGreaterThanPrevious = grapes.get(i) > grapes.get(previousIndex);
                    boolean isGreaterThanNext = grapes.get(i) > grapes.get(nextIndex);
                    boolean isGreaterGrape = isGreaterThanPrevious && isGreaterThanNext;

                    if (isGreaterGrape){
                        grapes.set(i, grapes.get(i) - 1);

                        if (grapes.get(previousIndex) > 0){
                            grapes.set(previousIndex, Math.max(grapes.get(previousIndex) - 2, 0));
                            grapes.set(i, grapes.get(i) + 1);
                        }
                        if (grapes.get(nextIndex) > 0){
                            grapes.set(nextIndex, Math.max(grapes.get(nextIndex) - 2, 0));
                            grapes.set(i, grapes.get(i) + 1);
                        }
                    }
                }
            }
            RemoveGrapesSmallerThanN(grapes, growthDays);
        }

        for (int grape :grapes) {
            System.out.print(grape + " ");
        }
    }

    private static void RemoveGrapesSmallerThanN(List<Integer> grapes, int n) {
        for (int i = 0; i < grapes.size(); i++) {
            if (grapes.get(i) < n) {
                grapes.remove(i);
                i--;
            }
        }
    }

    private static void IncrementAllGrapes(List<Integer> grapes) {
        for (int i = 0; i < grapes.size(); i++) {
            if (grapes.get(i) != 0) {
                grapes.set(i, grapes.get(i) + 1);
            }
        }
    }
}
