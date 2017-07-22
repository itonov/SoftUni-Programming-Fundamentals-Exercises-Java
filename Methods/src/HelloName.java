import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String name = console.nextLine();

        HelloName(name);

    }

    public static void HelloName(String name){
        System.out.println("Hello, " + name + "!");
    }
}
