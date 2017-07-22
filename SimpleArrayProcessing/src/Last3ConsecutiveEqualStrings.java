import java.util.Scanner;

public class Last3ConsecutiveEqualStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] words = console.nextLine().split(" ");

        for (int i = words.length - 1; i > 0; i--) {
            String lastWord = words[i];
            String secondToLastWord = words[i - 1];
            String thirdToLastWord = words[i - 2];

            if (lastWord.equals(secondToLastWord) && lastWord.equals(thirdToLastWord)){
                System.out.println(lastWord + " " + secondToLastWord + " " + thirdToLastWord);
                break;
            }
        }
    }
}
