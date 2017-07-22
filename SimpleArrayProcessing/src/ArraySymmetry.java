import java.util.Scanner;

public class ArraySymmetry {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] text = console.nextLine().split(" ");

        boolean isSymmetrical = true;

        for (int i = 0; i < text.length / 2; i++) {
            String firstWord = text[i];
            String lastWord = text[text.length - 1 - i];

            if (!firstWord.equals(lastWord)){
                isSymmetrical = false;
                break;
            }
        }

        if (isSymmetrical){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
