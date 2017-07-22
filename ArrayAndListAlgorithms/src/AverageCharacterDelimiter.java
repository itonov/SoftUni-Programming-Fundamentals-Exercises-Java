import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AverageCharacterDelimiter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputString = Arrays.asList(console.nextLine().split(" "));

        int listSum = 0;
        int charCounter = 0;

        for (int i = 0; i < inputString.size(); i++) {
            String temp = inputString.get(i);

            for (int j = 0; j < temp.length(); j++) {
                listSum += (int) temp.charAt(j);
                charCounter ++;
            }
        }

        listSum /= charCounter;

        char delimitChar = (char) Character.toUpperCase(listSum);

        for (int i = 0; i < inputString.size(); i++) {
            if (i + 1 == inputString.size()){
                System.out.print(inputString.get(i));
            }
            else {
                System.out.print(inputString.get(i) + delimitChar);
            }
        }
    }
}
