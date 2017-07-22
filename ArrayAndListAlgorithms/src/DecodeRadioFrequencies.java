import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecodeRadioFrequencies {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] inputNumbers = console.nextLine().split(" ");

        List<Character> result = new ArrayList<>();

        for (int i = 0; i < inputNumbers.length; i++) {
            String[] numberParts = new String[2];
            numberParts = inputNumbers[i].split("\\.");
            int leftPart = Integer.parseInt(numberParts[0]);
            int rightPart = Integer.parseInt(numberParts[1]);

            if (leftPart != 0){
                result.add(i, (char) leftPart);
            }

            if (rightPart != 0){
                result.add(result.size() - i, (char) rightPart);
            }
        }

        for (char letter : result) {
            System.out.print(letter);
        }
    }
}
