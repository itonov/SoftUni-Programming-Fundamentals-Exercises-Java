import java.util.Scanner;

public class DrawaFilledSquare {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        PrintHeaderRow(number);

        for (int i = 0; i < number - 2; i++) {
            PrintMiddleRow(number);
        }

        PrintHeaderRow(number);
    }

    public static void PrintHeaderRow(int n){
        System.out.print(repeatStr("-", 2 * n));
        System.out.println();
    }

    public static String repeatStr(String str, int number){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append(str);
        }

        return sb.toString();
    }

    public static void PrintMiddleRow(int n){
        System.out.print("-");

        for (int i = 1; i < n; i++) {
            System.out.print("\\/");
        }

        System.out.println("-");
    }
}
