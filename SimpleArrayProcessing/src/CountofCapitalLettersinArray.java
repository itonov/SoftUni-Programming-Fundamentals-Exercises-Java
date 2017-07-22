import java.util.Scanner;

public class CountofCapitalLettersinArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] text = console.nextLine().split(" ");

        int capitalCharsCount = 0;

        for (int i = 0; i < text.length; i++) {
            String currentWord = text[i];
            if (currentWord.length() == 1){
                char currentChar = currentWord.charAt(0);

                if (currentChar >= 'A' && currentChar <= 'Z'){
                    capitalCharsCount ++;
                }
            }
        }

        System.out.println(capitalCharsCount);
    }
}
