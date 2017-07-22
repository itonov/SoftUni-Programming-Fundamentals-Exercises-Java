import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShootListElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String inputLine = console.nextLine();

        List<Integer> numbers = new ArrayList<>();
        int lastRemovedElement = 0;

        while (!inputLine.equals("stop")){

            if (numbers.size() == 0 && inputLine.equals("bang")){
                System.out.println("nobody left to shoot! last one was " + lastRemovedElement);
                break;
            }

            if (inputLine.equals("bang")){
                double averageNumber = FindAverageNumberInList(numbers);

                lastRemovedElement = RemoveFirstElementLowerThanAverageAndSaveIt(numbers, averageNumber);
                DecrementListValuesByOne(numbers);


            }
            else {
                numbers.add(0, Integer.parseInt(inputLine));
            }
            inputLine = console.nextLine();

        }

        if (numbers.size() > 0){
            System.out.print("survivors: ");

            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
        else if (numbers.size() == 0 && !inputLine.equals("bang")){
            System.out.println("you shot them all. last one was " + lastRemovedElement);
        }
    }

    private static void DecrementListValuesByOne(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) - 1);
        }
    }

    private static int RemoveFirstElementLowerThanAverageAndSaveIt(List<Integer> numbers, double averageNumber) {
        int lastRemovedElement = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= averageNumber){
                System.out.println("shot " + numbers.get(i));
                lastRemovedElement = numbers.get(i);
                numbers.remove(numbers.get(i));
                break;
            }
        }
        return lastRemovedElement;
    }

    private static double FindAverageNumberInList(List<Integer> numbers) {
        double averageNumber = 0;

        for (int number : numbers) {
            averageNumber += number;
        }

        averageNumber /= numbers.size();
        return averageNumber;
    }
}
