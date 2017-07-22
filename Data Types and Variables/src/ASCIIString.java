import java.util.Scanner;

public class ASCIIString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        String output = "";
        for (int i = 0; i < n; i++) {
            int intLines = Integer.parseInt(console.nextLine());
            char words = (char) intLines;
            output += String.valueOf(words);
        }
        System.out.print(output);
    }
}
