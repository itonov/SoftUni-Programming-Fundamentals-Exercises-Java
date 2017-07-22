import java.util.Scanner;

public class NthDigit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());
        int index = Integer.parseInt(console.nextLine());


        System.out.println(FindNthDigit(number, index));
    }

    public static int FindNthDigit(int num, int index){
        int digit = 0;
        int times = 1;
        while (num > 0){
            if (times == index){
                num %= 10;
                digit = num;
                return digit;
            }
            else {
                num = num / 10;
            }
            times ++;
        }
        return digit;
    }
}
