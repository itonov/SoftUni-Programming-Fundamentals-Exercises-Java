import java.util.Scanner;

public class CalculateTriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double width = Double.parseDouble(console.nextLine());
        double height = Double.parseDouble(console.nextLine());

        double area = GetTriangleArea(width, height);
        System.out.println(area);

    }

    public static double GetTriangleArea(double width, double height){
        return width * height / 2;
    }
}
