import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SplitbyWordCasing {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputWords = Arrays.asList(console.nextLine().split(" "));

        removeChars(inputWords);

        List<String> lowercaseWords = lowercaseCheck(inputWords);
        List<String> uppercaseWords = uppercaseCheck(inputWords);
        List<String> mixedcaseWords = mixedcaseCheck(inputWords);

        System.out.print("Lower-case: ");

        for (int i = 0; i <= lowercaseWords.size() - 1; i++) {
            if (i < lowercaseWords.size() - 1){
                System.out.print(lowercaseWords.get(i) + ", ");
            }
            else {
                System.out.print(lowercaseWords.get(i));
            }
        }

        System.out.println();
        System.out.print("Mixed-case: ");

        for (int i = 0; i <= mixedcaseWords.size() - 1; i++) {
            if (i < mixedcaseWords.size() - 1){
                System.out.print(mixedcaseWords.get(i) + ", ");
            }
            else {
                System.out.print(mixedcaseWords.get(i));
            }
        }

        System.out.println();
        System.out.print("Upper-case: ");

        for (int i = 0; i <= uppercaseWords.size() - 1; i++) {
            if (i < uppercaseWords.size() - 1){
                System.out.print(uppercaseWords.get(i) + ", ");
            }
            else {
                System.out.print(uppercaseWords.get(i));
            }
        }
    }

    public static List<String> mixedcaseCheck(List<String> words){

        List<String> mixedcaseWords = new ArrayList<>();

        for (String word:words) {
            String[] letters = word.split("");
            int lowerLettersCount = 0;
            int upperLettersCount = 0;

            for (int i = 0; i < letters.length; i++) {

                if (Character.isLowerCase(letters[i].charAt(0))) {
                    lowerLettersCount++;
                }
                else if (Character.isUpperCase(letters[i].charAt(0))) {
                    upperLettersCount++;
                }
            }

            if (lowerLettersCount != letters.length && upperLettersCount != letters.length) {

                mixedcaseWords.add(word);
            }
        }

        return mixedcaseWords;
    }

    public static List<String> lowercaseCheck(List<String> words){

        List<String> lowercaseWords = new ArrayList<>();

        for (String word:words) {
            String[] letters = word.split("");
            int lowerLettersCount = 0;

            for (int i = 0; i < letters.length; i++) {

                if (Character.isLowerCase(letters[i].charAt(0))){
                    lowerLettersCount++;
                }
                else {
                    break;
                }
            }

            if (lowerLettersCount == letters.length) {

                lowercaseWords.add(word);
            }
        }

        return lowercaseWords;
    }


    public static List<String> uppercaseCheck(List<String> words){

        List<String> uppercaseWords = new ArrayList<>();

        for (String word:words) {
            String[] letters = word.split("");
            int upperLettersCount = 0;

            for (int i = 0; i < letters.length; i++) {

                if (Character.isUpperCase(letters[i].charAt(0))){
                    upperLettersCount++;
                }
                else {
                    break;
                }
            }

            if (upperLettersCount == letters.length){

                uppercaseWords.add(word);
            }
        }

        return uppercaseWords;
    }

    public static void removeChars(List<String> inputWords){
        String charsToRemove = "[,;:.!()\"'\\/[/]]";

        int index = 0;

        for (String text:inputWords) {
            inputWords.set(index++, text.replaceAll(charsToRemove, ""));
        }
    }
}