import java.util.Scanner;

public class CharRotation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String text = console.nextLine();
        String[] numbers = console.nextLine().split(" ");
        int[] numbersToUse = new int[numbers.length];

        for (int i = 0; i < numbersToUse.length; i++) {
            numbersToUse[i] = Integer.parseInt(numbers[i]);
        }

        String result = "";

        for (int i = 0; i < numbersToUse.length; i++) {
            if (numbersToUse[i] % 2 == 0){
                result += (char)(text.charAt(i) - numbersToUse[i]);
            }
            else {
                result += (char)(text.charAt(i) + numbersToUse[i]);
            }
        }

        System.out.println(result);
    }
}
