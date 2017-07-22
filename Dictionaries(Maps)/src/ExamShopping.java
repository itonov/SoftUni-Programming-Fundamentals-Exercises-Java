import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExamShopping {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String productQuantityInput = console.nextLine();

        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while (!productQuantityInput.equals("shopping time")){
            String[] elements = productQuantityInput.split(" ");
            String product = elements[1];
            int quantity = Integer.parseInt(elements[elements.length - 1]);

            if (!productQuantity.containsKey(product)){
                productQuantity.put(product, 0);
            }

            productQuantity.put(product, productQuantity.get(product) + quantity);

            productQuantityInput = console.nextLine();
        }

        productQuantityInput = console.nextLine();

        while (!productQuantityInput.equals("exam time")) {
            String[] elements = productQuantityInput.split(" ");
            String product = elements[1];
            int quantity = Integer.parseInt(elements[elements.length - 1]);

            if (productQuantity.containsKey(product)){
                if (productQuantity.get(product) == 0){
                    System.out.println(product + " out of stock");
                }
                else {
                    productQuantity.put(product, Math.max(productQuantity.get(product) - quantity, 0));
                }
            }
            else {
                System.out.println(product + " doesn't exist");
            }

            productQuantityInput = console.nextLine();
        }

        for (Map.Entry<String, Integer> kvp : productQuantity.entrySet()) {
            String product = kvp.getKey();
            int quantity = kvp.getValue();

            if (quantity > 0){
                System.out.println(product + " -> " + quantity);
            }
        }
    }
}
