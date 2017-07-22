import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DictRef {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String inputLine = console.nextLine();

        Map<String, Integer> result = new LinkedHashMap<>();

        while (!inputLine.equals("end")){
            String[] elements = inputLine.split(" ");
            String firstElement = elements[0];
            String lastElement = elements[elements.length - 1];

            if (tryParseInt(lastElement)) {
                result.put(firstElement, Integer.parseInt(lastElement));

            }
            else {
                if (result.containsKey(lastElement)){
                    result.put(firstElement, result.get(lastElement));
                }
            }

            inputLine = console.nextLine();
        }

        for (Map.Entry<String, Integer> kvp : result.entrySet()) {
            String key = kvp.getKey();
            int value = kvp.getValue();

            System.out.println(key + " === " + value);
        }

    }

    public static boolean tryParseInt (String value){
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
