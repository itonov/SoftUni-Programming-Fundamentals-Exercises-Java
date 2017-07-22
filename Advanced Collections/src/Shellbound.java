import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class Shellbound {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String regionAndSize = console.nextLine();

        Map<String, LinkedHashSet<String>> regionAndShells = new LinkedHashMap<>();

        while (!regionAndSize.equals("Aggregate")) {
            String[] tokens = regionAndSize.split(" ");
            String region = tokens[0];
            String shellSize = tokens[1];

            if (!regionAndShells.containsKey(region)){
                regionAndShells.put(region, new LinkedHashSet<>());
            }

            regionAndShells.get(region).add(shellSize);

            regionAndSize = console.nextLine();
        }

        for (Map.Entry<String, LinkedHashSet<String>> regionSizePair : regionAndShells.entrySet()) {
            String region = regionSizePair.getKey();
            LinkedHashSet<String> listOfSizes = regionSizePair.getValue();
            int shellSum = 0;

            for (String shell : listOfSizes) {
                shellSum += Integer.parseInt(shell);
            }

            int giantShellSize = shellSum - (shellSum / listOfSizes.size());

            System.out.println(region + " -> " + String.join(", ", listOfSizes) + " (" + giantShellSize + ")");

        }
    }
}
