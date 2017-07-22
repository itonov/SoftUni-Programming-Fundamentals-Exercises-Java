import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        Map<String, Map<String, List<String>>> continentCountryTown = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = console.nextLine().split(" ");
            String continent = input[0];
            String country = input[1];
            String town = input[2];

            if (!continentCountryTown.containsKey(continent)){
                continentCountryTown.put(continent, new LinkedHashMap<>());
            }

            if (!continentCountryTown.get(continent).containsKey(country)){
                continentCountryTown.get(continent).put(country, new ArrayList<>());
            }

            continentCountryTown.get(continent).get(country).add(town);
        }

        for (Map.Entry<String, Map<String, List<String>>> keyValuePair : continentCountryTown.entrySet()) {
            String continent = keyValuePair.getKey();
            Map<String, List<String>> countryTown = keyValuePair.getValue();

            System.out.println(continent + ":");

            for (Map.Entry<String,  List<String>> countryTownPair : countryTown.entrySet()) {
                String country = countryTownPair.getKey();
                List<String> town = countryTownPair.getValue();

                System.out.println(country + " -> " + String.join(", ", town));
            }

        }
    }
}
