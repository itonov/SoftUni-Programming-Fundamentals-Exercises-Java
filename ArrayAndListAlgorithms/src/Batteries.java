    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
    import java.util.Scanner;

    public class Batteries {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);

            List<String> inputCapacity = Arrays.asList(console.nextLine().split(" "));
            List<String> inputUsagePerHour = Arrays.asList(console.nextLine().split(" "));
            int testHours = Integer.parseInt(console.nextLine());

            List<Double> capacity = new ArrayList<>();
            List<Double> usagePerHour = new ArrayList<>();

            ConvertFromStringToDoubleList(inputCapacity, capacity);
            ConvertFromStringToDoubleList(inputUsagePerHour, usagePerHour);

            for (int i = 0; i < capacity.size(); i++) {
                int hoursCount = 0;
                double originalCapacity = capacity.get(i);

                for (int j = 0; j < testHours; j++) {

                    if (capacity.get(i) < 0){
                        break;
                    }
                    capacity.set(i, capacity.get(i) - usagePerHour.get(i));
                    hoursCount++;
                }

                if (capacity.get(i) < 0){
                    System.out.println("Battery " + (i + 1) + ": dead (lasted " + hoursCount + " hours)");
                }
                else {
                    double remainingCapacityPercentage = (capacity.get(i) * 100) / originalCapacity;

                    System.out.printf("Battery %d: %.2f mAh (%.2f", (i + 1), capacity.get(i), remainingCapacityPercentage);
                    System.out.print(")%");
                    System.out.println();
                }
            }
        }

        private static List<Double> ConvertFromStringToDoubleList(List<String> inputNumbers, List<Double> convertedNumbers) {
            for (String word : inputNumbers) {
                convertedNumbers.add(Double.parseDouble(word));
            }
            return convertedNumbers;
        }
    }
