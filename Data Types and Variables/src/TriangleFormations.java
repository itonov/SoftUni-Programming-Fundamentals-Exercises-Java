import java.util.Scanner;

public class TriangleFormations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());
        if ((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("Triangle is valid.");
            if (a * a + b * b == c * c){
                System.out.println("Triangle has a right angle between sides a and b");
            } else if (b * b + c * c == a * a){
                System.out.println("Triangle has a right angle between sides b and c");
            } else if (a * a + c * c == b * b){
                System.out.println("Triangle has a right angle between sides a and c");
            } else {
                System.out.println("Triangle has no right sides");
            }
        } else {
            System.out.println("Invalid Triangle.");
        }
    }
}
