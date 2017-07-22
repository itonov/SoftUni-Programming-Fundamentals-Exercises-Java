import java.util.*;

public class ShortWordsSorted {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputWords = Arrays.asList(console.nextLine().toLowerCase().split("[.,:;()\\[\\]'\\\\/!?\\s\"]+"));

        LinkedList<String> words = new LinkedList<>();
        words.addAll(inputWords);

        Collections.sort(words);

        for (int i = 0; i < words.size() - 1; i++) {
            if (words.get(i).equals(words.get(i + 1))){
                words.remove(i + 1);
                i--;
            }
        }

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() < 5){
                if (i + 1 == words.size()){
                    System.out.print(words.get(i));
                }
                else {
                    System.out.print(words.get(i) + ", ");
                }
            }
        }
    }
}
