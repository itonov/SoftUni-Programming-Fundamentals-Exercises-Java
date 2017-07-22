import java.util.Scanner;

public class StringEncryption {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numberOfChars = Integer.parseInt(console.nextLine());
        String result = "";

        for (int i = 0; i < numberOfChars; i++) {
            char currentChar = console.next().charAt(0);
            String enctypted = Encrypt(currentChar);
            result += enctypted;
        }

        System.out.println(result);

    }

    public static String Encrypt(char toEncrypt){
        int asciiCode = (int) toEncrypt;

        int firstDigit = GetFirstDigit(asciiCode);
        int lastDigit = GetLastDigit(asciiCode);

        String result = Integer.toString(firstDigit) + lastDigit;

        result = (char)AppendLastDigit(asciiCode, lastDigit) + result + (char)AppendFirstDigit(asciiCode, firstDigit);

        return result;

    }

    private static int AppendFirstDigit(int asciiCode, int firstDigit) {

        int firstDigitToAppend = asciiCode - firstDigit;

        return firstDigitToAppend;
    }

    private static int AppendLastDigit(int asciiCode, int lastDigit) {

        int lastDigitToAppend = asciiCode + lastDigit;

        return lastDigitToAppend;
    }

    public static int GetFirstDigit(int asciiCode){
        int firstDigit = asciiCode;

        while (firstDigit >= 10){
            firstDigit /= 10;
        }

        return firstDigit;
    }

    public static int GetLastDigit(int asciiCode){
        int lastDigit = asciiCode % 10;

        return lastDigit;
    }
}
