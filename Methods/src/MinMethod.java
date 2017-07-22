import java.util.Scanner;

public class MinMethod {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNum = Integer.parseInt(console.nextLine());
        int secondNum = Integer.parseInt(console.nextLine());
        int thirdNum = Integer.parseInt(console.nextLine());

        if (SmallerNumber(firstNum, secondNum) < thirdNum){
            System.out.println(SmallerNumber(firstNum, secondNum));
        }
        else {
            System.out.println(thirdNum);
        }
    }

    public static int SmallerNumber(int a, int b){
        int result = 0;
        if (a > b){
            result = b;
        }
        else {
            result = a;
        }
        return result;
    }
}
