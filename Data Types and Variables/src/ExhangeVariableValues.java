import java.util.Scanner;

public class ExhangeVariableValues {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int temporal = a;
        a = b;
        b = temporal;
        System.out.println(a);
        System.out.println(b);

    }

}
