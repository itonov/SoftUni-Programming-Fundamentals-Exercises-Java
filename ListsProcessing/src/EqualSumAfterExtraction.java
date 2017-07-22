import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EqualSumAfterExtraction {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputList1 = Arrays.asList(console.nextLine().split(" "));
        List<String> inputList2 = Arrays.asList(console.nextLine().split(" "));

        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        for (String word:inputList1) {
            firstList.add(Integer.parseInt(word));
        }

        for (String word:inputList2) {
            secondList.add(Integer.parseInt(word));
        }
        
        secondList = RemoveElementsFromSecondList(firstList, secondList);
        int firstListSum = sumElementsInList(firstList);
        int secondListSum = sumElementsInList(secondList);

        if (firstListSum == secondListSum){
            System.out.println("Yes. Sum: " + firstListSum);
        }
        else {
            System.out.println("No. Diff: " + Math.abs(firstListSum - secondListSum));
        }
    }

    private static int sumElementsInList(List<Integer> numbers) {
        int count = 0;

        for (Integer number:numbers) {
            count += number;
        }

        return count;
    }

    private static List<Integer> RemoveElementsFromSecondList(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> elementsRemoved = new ArrayList<>();

        for (int i = 0; i < secondList.size(); i++) {

            boolean shouldRemain = true;
            for (Integer number:firstList) {
                if (secondList.get(i).equals(number)) {
                    shouldRemain = false;
                    break;
                }
            }

            if (shouldRemain){
                elementsRemoved.add(secondList.get(i));
            }
        }
        return elementsRemoved;
    }
}
