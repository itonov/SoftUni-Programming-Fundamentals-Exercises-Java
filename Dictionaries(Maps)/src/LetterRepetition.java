import java.util.*;

public class LetterRepetition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        List<Character> charsToCheck = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            charsToCheck.add(input.charAt(i));
        }

        Map<Character, Integer> occurancesCount = new LinkedHashMap<>();

        for (Character letter : charsToCheck) {
            if (!occurancesCount.containsKey(letter)){
                occurancesCount.put(letter, 0);
            }

            occurancesCount.put(letter, occurancesCount.get(letter) + 1);
        }

        for (Map.Entry<Character, Integer> letter : occurancesCount.entrySet()){
            char key = letter.getKey();
            int value = letter.getValue();

            System.out.println(key + " -> " + value);
        }
    }
}
