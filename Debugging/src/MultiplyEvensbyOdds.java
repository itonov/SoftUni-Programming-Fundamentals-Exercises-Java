import java.util.Scanner;

public class MultiplyEvensbyOdds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        System.out.println(GetMultipleOfEvenAndOdds(Math.abs(number)));
    }

    public static int GetMultipleOfEvenAndOdds(int n){

        int sumEvens = GetSumOfEvenDigits(n);
        int sumOdds = GetSumOfOddDigits(n);
        return sumEvens * sumOdds;
    }

    public static int GetSumOfEvenDigits(int n){
        int sum = 0;

        while (n > 0){
            int lastDigit = n % 10;
            if (lastDigit % 2 == 0){
                sum += lastDigit;
            }
            n /= 10;
        }
        return sum;
    }

    public static int GetSumOfOddDigits(int n){
        int sum = 0;

        while (n > 0){
            int lastDigit = n % 10;
            if (lastDigit % 2 != 0){
                sum += lastDigit;
            }
            n /= 10;
        }
        return sum;
    }
}
