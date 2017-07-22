import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StuckZipper {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputFirstList = Arrays.asList(console.nextLine().split(" "));
        List<String> inputSecondList = Arrays.asList(console.nextLine().split(" "));

        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        for (String word:inputFirstList) {
            firstList.add(Integer.parseInt(word));
        }

        for (String word:inputSecondList) {
            secondList.add(Integer.parseInt(word));
        }

        int numberOfIdealDigits = CalculateIdealDigits(firstList, secondList);

        RemoveBadElements(firstList, numberOfIdealDigits);
        RemoveBadElements(secondList, numberOfIdealDigits);

        int indexToInsert = 1;

        for (int number:firstList) {
            secondList.add(Math.min(indexToInsert, secondList.size()), number);
            indexToInsert += 2;
        }

        for (int number:secondList) {
            System.out.print(number + " ");
        }
    }

    private static void RemoveBadElements(List<Integer> numbers, int numberOfIdealDigits) {
        for (int i = 0; i < numbers.size(); i++) {

            int digitsCounter = CalculateNumberOfDigits(numbers.get(i));

            if (digitsCounter > numberOfIdealDigits){
                numbers.remove(numbers.get(i));
                i --;
            }
        }
    }

    private static int CalculateNumberOfDigits(int number){
        int digitsCount = 0;

        while (Math.abs(number) > 0){
            number /= 10;
            digitsCount ++;
        }

        return digitsCount;
    }

    private static int CalculateIdealDigits(List<Integer> firstList, List<Integer> secondList) {
        int idealNumberOfDigits = Integer.MAX_VALUE;

        for (int number:firstList) {
            int numberOfDigits = CalculateNumberOfDigits(number);

            if (numberOfDigits < idealNumberOfDigits){
                idealNumberOfDigits = numberOfDigits;
            }
        }

        for (int number:secondList) {
            int numberOfDigits = CalculateNumberOfDigits(number);

            if (numberOfDigits < idealNumberOfDigits){
                idealNumberOfDigits = numberOfDigits;
            }
        }

        return idealNumberOfDigits;
    }
}
