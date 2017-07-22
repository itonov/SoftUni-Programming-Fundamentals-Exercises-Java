import java.util.Scanner;

public class RefactorVolumeofPyramid {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Length: ");
        double length = Double.parseDouble(console.nextLine());
        System.out.printf("Width: ");
        double width = Double.parseDouble(console.nextLine());
        System.out.printf("Height: ");
        double height = Double.parseDouble(console.nextLine());
        double volume = length + width + height;
        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
