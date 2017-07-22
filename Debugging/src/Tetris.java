import java.util.Scanner;

public class Tetris {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        String currentDirection = console.nextLine();

        while (currentDirection.equals("up") || currentDirection.equals("down") || currentDirection.equals("right") || currentDirection.equals("left")){
            switch (currentDirection){
                case "up":
                    UpDirection(n);
                    break;
                case "down":
                    DownDirection(n);
                    break;
                case "right":
                    RightDirection(n);
                    break;
                case "left":
                    LeftDirection(n);
                    break;
            }
            currentDirection = console.nextLine();
        }
    }

    public static String repeatStr(String str, int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void LeftDirection(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr(".", n));
            System.out.println(repeatStr("*", n));

        }

        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr("*", n * 2));
        }

        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr(".", n));
            System.out.println(repeatStr("*", n));
        }
    }

    public static void RightDirection(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr("*", n));
            System.out.println(repeatStr(".", n));
        }
        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr("*", 2 * n));
        }
        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr("*", n));
            System.out.println(repeatStr(".", n));
        }
    }

    public static void UpDirection(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr(".", n));
            System.out.print(repeatStr("*", n));
            System.out.println(repeatStr(".", n));
        }
          for (int i = 0; i < n; i++) {
            System.out.println(repeatStr("*", n * 3));
        }
    }

    public static void DownDirection(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr("*", n * 3));
        }
        for (int i = 0; i < n; i++) {
            System.out.print(repeatStr(".", n));
            System.out.print(repeatStr("*", n));
            System.out.println(repeatStr(".", n));
        }
    }
    
}
