import java.util.Scanner;

public class StringRepeater {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String stringToRepeat = console.nextLine();
        int repeatTimes = Integer.parseInt(console.nextLine());

        System.out.println(RepeatStr(stringToRepeat, repeatTimes));
    }

    public static String RepeatStr(String str, int times){
        StringBuilder repeat = new StringBuilder();

        for (int i = 0; i < times; i++) {
            repeat.append(str);
        }
        return repeat.toString();
    }
}
