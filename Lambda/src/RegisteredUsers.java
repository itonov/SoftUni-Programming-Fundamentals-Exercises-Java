import jdk.internal.util.xml.impl.Pair;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class RegisteredUsers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Map<String, Date> userDate = new LinkedHashMap<>();

        String inputParams = console.nextLine();

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        while (!inputParams.equals("end")){
            String[] tokens = inputParams.split(" -> ");
            String userName = tokens[0];
            String date = "";
            Date registeredDate = new Date();
            try {
                registeredDate = dateFormat.parse(tokens[1]);
                date = dateFormat.format(registeredDate);
            } catch (ParseException e){
                e.printStackTrace();
            }

            if (!userDate.containsKey(userName)){
                userDate.put(userName, registeredDate);
            }

            inputParams = console.nextLine();

        }

        Map<String, Date> reversedUserDate = new TreeMap<String, Date>(Collections.reverseOrder(userDate));

        Collections.reverseOrder(reversedUserDate);

        Map<String, Date> result = reversedUserDate.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap:: new));

        System.out.println();

    }
}
