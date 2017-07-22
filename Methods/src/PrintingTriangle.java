import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        PrintTriangle(n);
    }

    public static void PrintTriangle(int n){
        for (int i = 1; i <= n ; i++) {
            PrintLine(1, i);
        }

        for (int i = n - 1; i >= 1; i--) {
            PrintLine(1, i);
        }
    }

    public static void PrintLine(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
