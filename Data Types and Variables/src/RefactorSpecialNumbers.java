import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        for (int i = 1; i < num; i++) {
            int currentNum = i;
            int sum = 0;
            while (currentNum > 0) {
                int lastDigit = currentNum % 10;
                currentNum = currentNum / 10;
                sum += lastDigit;
            }
            boolean isTrue = (sum == 5) || (sum == 7) || (sum == 11);
            if (isTrue){
                System.out.println(i + "-> True");
            } else {
                System.out.println(i + "-> False");
            }
        }
    }
}
