import java.util.*;

public class OddOccurances {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputWords = Arrays.asList(console.nextLine().split(" "));
        List<String> lowerCaseWords = new ArrayList<>();

        for (String word : inputWords) {
            lowerCaseWords.add(word.toLowerCase());
        }

        Map<String, Integer> occurancesCount = new HashMap<>();
        List<String> keysHolder = new ArrayList<>();

        for (String word : lowerCaseWords) {
            if (!occurancesCount.containsKey(word)){
                occurancesCount.put(word, 0);
                keysHolder.add(word);
            }
            occurancesCount.put(word, occurancesCount.get(word) + 1);
        }

        List<String> oddValueKeys = new ArrayList<>();

        for (String word : keysHolder) {
            if (occurancesCount.get(word) % 2 != 0){
                oddValueKeys.add(word);
            }
        }

        for (int i = 0; i < oddValueKeys.size(); i++) {
            if (i + 1 == oddValueKeys.size()){
                System.out.print(oddValueKeys.get(i));
            }
            else {
                System.out.print(oddValueKeys.get(i) + ", ");
            }
        }
    }
}
