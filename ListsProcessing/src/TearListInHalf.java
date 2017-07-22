import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TearListInHalf {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputList = Arrays.asList(console.nextLine().split(" "));

        List<Integer> leftHalf = new ArrayList<>();
        List<Integer> rightHalf = new ArrayList<>();

        for (int i = 0; i < inputList.size() / 2; i++) {
            leftHalf.add(Integer.parseInt(inputList.get(i)));
        }

        for (int i = inputList.size() / 2; i < inputList.size(); i++) {
            rightHalf.add(Integer.parseInt(inputList.get(i)));
        }

        int indexToInsert = 0;

        for (int i = 0; i < rightHalf.size(); i++) {
            int firstNumber = rightHalf.get(i) / 10;
            int secondNumber = rightHalf.get(i) % 10;

            leftHalf.add(indexToInsert, firstNumber);
            leftHalf.add(indexToInsert + 2, secondNumber);

            indexToInsert += 3;
        }

        for (Integer number: leftHalf) {
            System.out.print(number + " ");
        }
    }
}
