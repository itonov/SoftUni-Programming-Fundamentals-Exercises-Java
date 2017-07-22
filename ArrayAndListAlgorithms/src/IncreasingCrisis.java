import java.util.*;

public class IncreasingCrisis {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        List<String> elements = new ArrayList<>();

        boolean removedElements = false;

        for (int i = 0; i < n; i++) {
            List<String> numbersToAdd = Arrays.asList(console.nextLine().split(" "));
            if (i == 0){
                elements.addAll(numbersToAdd);
            }
            else {
                removedElements = false;
                List<String> sequencedNumbers = RemoveElementsBreakingTheSequence(numbersToAdd);

                if (numbersToAdd.size() > sequencedNumbers.size()) {
                    removedElements = true;
                }

                int indexOfLastAddedNumber = 0;

                for (int j = 0; j < elements.size() - 1; j++) {
                    int currentNumber = Integer.parseInt(elements.get(j));
                    int nextNumber = Integer.parseInt(elements.get(j + 1));
                    if (currentNumber <= Integer.parseInt(sequencedNumbers.get(0)) && nextNumber > Integer.parseInt(sequencedNumbers.get(0))) {
                        int indexToInsert = j + 1;

                        for (String number : sequencedNumbers) {
                            elements.add(indexToInsert, number);
                            indexOfLastAddedNumber = indexToInsert;
                            indexToInsert++;
                        }
                        break;
                    }
                }

                if (removedElements) {
                    for (int j = indexOfLastAddedNumber + 1; j < elements.size(); j++) {
                        elements.remove(j);
                        j--;
                    }
                }
            }
        }

        for (String word : elements) {
            System.out.print(word + " ");
        }
    }

    private static List<String> RemoveElementsBreakingTheSequence(List<String> numbersToAdd) {
        List<String> remainingNumbers = new ArrayList<>();
        remainingNumbers.add(numbersToAdd.get(0));

        for (int i = 0; i < numbersToAdd.size() - 1; i++) {

            if (Integer.parseInt(numbersToAdd.get(i)) <= Integer.parseInt(numbersToAdd.get(i + 1))){
                remainingNumbers.add(numbersToAdd.get(i + 1));
            }
        }

        return remainingNumbers;
    }
}
