import java.util.*;

public class TrackDownloader {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> wordsToRemove = Arrays.asList(console.nextLine().split(" "));

        List<String> songs = new ArrayList<>();
        String inputWord = console.nextLine();

        while (!inputWord.equals("end")){

            boolean isInBlackList = false;
            for (String word:wordsToRemove) {
                if (inputWord.contains(word)){
                    isInBlackList = true;
                    break;
                }
            }

            if (!isInBlackList){
                songs.add(inputWord);
            }

            inputWord = console.nextLine();
        }

        Collections.sort(songs);

        for (String song:songs) {
            System.out.println(song);
        }
    }
}
