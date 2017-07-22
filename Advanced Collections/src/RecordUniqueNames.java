import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RecordUniqueNames {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        HashSet<String> names = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String inputName = console.nextLine();

            names.add(inputName);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
