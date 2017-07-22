import java.util.Scanner;

public class RotateArrayofStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] wordsToRotate = console.nextLine().split(" ");

        String lastWord = wordsToRotate[wordsToRotate.length -1];

        String[] rotatedWords = new String[wordsToRotate.length];

        for (int i = 0; i < wordsToRotate.length - 1; i++) {
            rotatedWords[i + 1] = wordsToRotate[i];
        }

        rotatedWords[0] = lastWord;

        for (int i = 0; i < rotatedWords.length; i++) {
            System.out.print(rotatedWords[i] + " ");
        }
    }
}
