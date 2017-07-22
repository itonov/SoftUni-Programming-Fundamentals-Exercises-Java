import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] phoneNumbers = console.nextLine().split(" ");
        String[] names = console.nextLine().split(" ");

        String namesToCall = "";

        while(!namesToCall.equals("done")){
            namesToCall = console.nextLine();

            for (int i = 0; i < names.length; i++) {
                if (namesToCall.equals(names[i])){
                    System.out.println(names[i] + " -> " + phoneNumbers[i]);
                }
            }
        }
    }
}
