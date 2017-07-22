import java.util.Scanner;

public class FloatorInteger {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double number = Double.parseDouble(console.nextLine());
        System.out.println(Math.round(number));
        //if (number == (int) number){
        //    System.out.println((int)number);
        //} else {
        //    System.out.println(Math.round(number));
        //}
    }
}
