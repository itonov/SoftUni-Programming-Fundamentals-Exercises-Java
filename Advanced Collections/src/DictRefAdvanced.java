import java.util.*;

public class DictRefAdvanced {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String inputParams = console.nextLine();

        Map<String, LinkedList<String>> nameAndValue = new LinkedHashMap<>();

        while (!inputParams.equals("end")){
            String[] tokens = inputParams.split("\\W+");
            String name = tokens[0];

            if (!nameAndValue.containsKey(name) && tryParseInt(tokens[1])){
                nameAndValue.put(name, new LinkedList<>());

                for (int i = 1; i < tokens.length; i++) {
                    nameAndValue.get(name).add(tokens[i]);
                }
            } else if (nameAndValue.containsKey(name) && tryParseInt(tokens[1])){
                for (int i = 1; i < tokens.length; i++) {
                    nameAndValue.get(name).add(tokens[i]);
                }
            }

            if (nameAndValue.containsKey(tokens[1])){
                String nameToFind = tokens[1];

                nameAndValue.put(name, nameAndValue.get(nameToFind));
            }

            inputParams = console.nextLine();
        }

        for (Map.Entry<String, LinkedList<String>> nameValuePair : nameAndValue.entrySet()) {
            String name = nameValuePair.getKey();
            LinkedList<String> valuesList = nameValuePair.getValue();

            System.out.println(name + " === " + String.join(", ", valuesList));
        }
    }

    private static boolean tryParseInt(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
