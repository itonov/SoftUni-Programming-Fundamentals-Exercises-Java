import java.util.Scanner;

public class LargestElementinArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(console.nextLine());
        }

        int biggestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggestNumber){
                biggestNumber = numbers[i];
            }
        }

        System.out.println(biggestNumber);
    }
}
