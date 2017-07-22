import java.util.Scanner;

public class TriangleFormations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());

        boolean isValid = (a + b) > c && (b + c) > a && (a + c) > b;

        if (isValid){
            System.out.println("Triangle is valid.");
            RightTriangle(a, b, c);
        }
        else {
            System.out.println("Invalid Triangle.");
        }
    }

    public static void RightTriangle(int a, int b, int c){
        if (a * a + b * b == c * c){
            System.out.println("Triangle has a right angle between sides a and b");
        }
        else if (a * a + c * c == b * b){
            System.out.println("Triangle has a right angle between sides a and c");
        }
        else if (b * b + c * c == a * a){
            System.out.println("Triangle has a right angle between sides b and c");
        }
        else {
            System.out.println("Triangle has no right angles.");
        }
    }

}
