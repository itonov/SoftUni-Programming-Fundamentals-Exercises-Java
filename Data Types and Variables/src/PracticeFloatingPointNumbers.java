import java.math.BigDecimal;

public class PracticeFloatingPointNumbers {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal(3.141592653589793238);
        float num2 = 1.60217657f;
        BigDecimal num3 = new BigDecimal("7.8184261974584555216535342341");
        System.out.printf("%.18f", num1);
        System.out.println();
        System.out.println(num2);
        System.out.println(num3);
    }
}
