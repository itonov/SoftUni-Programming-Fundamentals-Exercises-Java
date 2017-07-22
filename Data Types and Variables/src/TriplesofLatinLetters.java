import java.util.Scanner;

public class TriplesofLatinLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.printf("%s%s%s",(char) (i + 'a'), (char) (j + 'a'), (char)(k + 'a'));
                    System.out.println();
                }
            }
        }

    }
}
