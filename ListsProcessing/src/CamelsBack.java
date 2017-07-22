import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CamelsBack {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputNumbers = Arrays.asList(console.nextLine().split(" "));
        int camelBackSize = Integer.parseInt(console.nextLine());

        List<Integer> buildings = new ArrayList<>();

        for (String word:inputNumbers) {
            buildings.add(Integer.parseInt(word));
        }

        if (buildings.size() > camelBackSize){
            int roundsCounter = 0;

            while (buildings.size() > camelBackSize){
                buildings.remove(0);
                buildings.remove(buildings.size() - 1);

                roundsCounter ++;
            }

            System.out.println(roundsCounter + " rounds");
            System.out.print("remaining: ");

            for (int number:buildings) {
                System.out.print(number + " ");
            }
        }
        else {
            System.out.print("already stable: ");

            for (int number:buildings) {
                System.out.print(number + " ");
            }
        }
    }
}
