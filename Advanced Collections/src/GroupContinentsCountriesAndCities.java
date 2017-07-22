import java.util.*;

public class GroupContinentsCountriesAndCities {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        SortedMap<String, SortedMap<String, SortedSet<String>>> continentCountryTown = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokensInput = console.nextLine().split(" ");
            String continent = tokensInput[0];
            String country = tokensInput[1];
            String town = tokensInput[2];

            if (!continentCountryTown.containsKey(continent)){
                continentCountryTown.put(continent, new TreeMap<>());
            }

            if (!continentCountryTown.get(continent).containsKey(country)){
                continentCountryTown.get(continent).put(country, new TreeSet<>());
            }

            continentCountryTown.get(continent).get(country).add(town);
        }

        for (Map.Entry<String, SortedMap<String, SortedSet<String>>> entryPair : continentCountryTown.entrySet()) {
            String continent = entryPair.getKey();
            SortedMap<String, SortedSet<String>> countryTown = entryPair.getValue();

            System.out.println(continent + ":");

            for (Map.Entry<String, SortedSet<String>> countryTownPair : countryTown.entrySet()) {
                String country = countryTownPair.getKey();
                SortedSet<String> towns = countryTownPair.getValue();

                System.out.println(" " + country + " -> " + String.join(", ", towns));
            }
        }
    }
}
