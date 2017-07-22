import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FilterBase {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String inputElements = console.nextLine();

        Map<String, String> namePosition = new LinkedHashMap<>();
        Map<String, Integer> nameAge = new LinkedHashMap<>();
        Map<String, Double> nameSalary = new LinkedHashMap<>();

        while (!inputElements.equals("filter base")){
            String[] tokens = inputElements.split(" ");
            String name = tokens[0];
            String secondElement = tokens[tokens.length - 1];

            if (TryParseInt(secondElement)){
                nameAge.put(name, Integer.parseInt(secondElement));

            }
            else if (TryParseDouble(secondElement)){
                nameSalary.put(name, Double.parseDouble(secondElement));
            }
            else {
                namePosition.put(name, secondElement);
            }

            inputElements = console.nextLine();
        }

        inputElements = console.nextLine();

        switch (inputElements){
            case "Age":
                for (Map.Entry<String, Integer> kvp : nameAge.entrySet()) {
                    String name = kvp.getKey();
                    int age = kvp.getValue();

                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("====================");
                }
                break;
            case "Salary":
                for (Map.Entry<String, Double> kvp : nameSalary.entrySet()) {
                    String name = kvp.getKey();
                    double salary = kvp.getValue();

                    System.out.println("Name: " + name);
                    System.out.printf("Salary: %.2f", salary);
                    System.out.println();
                    System.out.println("====================");
                }
                break;
            case "Position":
                for (Map.Entry<String, String> kvp : namePosition.entrySet()) {
                    String name = kvp.getKey();
                    String position = kvp.getValue();

                    System.out.println("Name: " + name);
                    System.out.println("Position: " + position);
                    System.out.println("====================");
                }
                break;
        }
    }

    private static boolean TryParseDouble(String secondElement) {
        try {
            Double.parseDouble(secondElement);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    private static boolean TryParseInt(String secondElement) {
        try {
            Integer.parseInt(secondElement);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
