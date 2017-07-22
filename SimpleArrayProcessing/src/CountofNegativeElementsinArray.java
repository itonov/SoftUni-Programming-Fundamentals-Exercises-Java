import java.util.Scanner;

public class CountofNegativeElementsinArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(console.nextLine());
        }

        int negativeCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0){
                negativeCount ++;
            }
        }

        System.out.println(negativeCount);
    }
}
