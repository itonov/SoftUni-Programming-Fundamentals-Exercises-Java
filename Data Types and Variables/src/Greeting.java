import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstName = console.nextLine();
        String lastName = console.nextLine();
        int age = Integer.parseInt(console.nextLine());;
        System.out.printf("Hello, %s %s. You are %d years old.", firstName, lastName, age);
    }
}
