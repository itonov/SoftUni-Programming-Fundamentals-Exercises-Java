import java.util.Scanner;

public class TrickyStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String delimiter = console.nextLine();
        int lines = Integer.parseInt(console.nextLine());
        String result = "";
        String text = "";
        for (int i = 0; i < lines; i++) {
            text = console.nextLine();
            result += text + delimiter;

        }
        System.out.print(result);
    }
}
