import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveElementsAtOddPositions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputText = Arrays.asList(console.nextLine().split(" "));
        List<String> evenElements = new ArrayList<>();

        for (int i = 0; i < inputText.size(); i++) {
            if ((i + 1) % 2 == 0){
                evenElements.add(inputText.get(i));
            }
        }

        for (String word : evenElements) {
            System.out.print(word);
        }
    }
}
