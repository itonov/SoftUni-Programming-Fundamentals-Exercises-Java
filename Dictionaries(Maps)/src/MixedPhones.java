import java.net.Inet4Address;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MixedPhones {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String inputLine = console.nextLine();

        Map<String, Long> phoneBook = new TreeMap<>();

        while (!inputLine.contains("Over")){
            String[] elements = inputLine.split(" ");
            String firstElement = elements[0];
            String secondElement = elements[elements.length - 1];

            if (!tryParseInt(firstElement)){
                phoneBook.put(firstElement, Long.parseLong(secondElement));
            }
            else {
                phoneBook.put(secondElement, Long.parseLong(firstElement));
            }

            inputLine = console.nextLine();
        }

        for (Map.Entry<String, Long> kvp: phoneBook.entrySet()) {
            String key = kvp.getKey();
            long value = kvp.getValue();

            System.out.println(key + " -> " + value);
        }
    }

    public static boolean tryParseInt (String textToParse){
        try {
            Integer.parseInt(textToParse);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
