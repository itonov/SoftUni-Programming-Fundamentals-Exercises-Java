import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppendLists {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputLists = Arrays.asList(console.nextLine().split("\\|"));
        List<String> result = new ArrayList<>();

        for (int i = inputLists.size() - 1; i >= 0; i--) {

            result.addAll(Arrays.asList(inputLists.get(i).split(" ")));
        }

        result.removeAll(Arrays.asList("", null));

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
