import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] phoneNumbers = console.nextLine().split(" ");
        String[] phoneNumbersToCalculate = new String[phoneNumbers.length];

        for (int i = 0; i < phoneNumbers.length; i++){
            phoneNumbersToCalculate[i] = phoneNumbers[i].replace("//+", "").replace("(", "").replace(")", "").replace("-", "");
        }

        String[] names = console.nextLine().split(" ");

        String[] namesToCall = new String[2];

        while(true){
            namesToCall = console.nextLine().split(" ");

            switch (namesToCall[0]){
                case "call":
                    for (int i = 0; i < phoneNumbersToCalculate.length; i++) {

                        long phoneDigits = Long.parseLong(phoneNumbersToCalculate[i]);
                        long sumOfDigits = 0;

                        while (phoneDigits > 0){
                            long lastDigit = phoneDigits % 10;
                            sumOfDigits += lastDigit;
                            phoneDigits /= 10;
                        }

                        if (namesToCall[1].equals(phoneNumbersToCalculate[i])){

                            System.out.println("calling " + names[i] + "...");

                            if (sumOfDigits % 2 == 1){
                                System.out.println("no answer");
                            }
                            else {
                                long seconds = sumOfDigits;
                                int minutes = 0;

                                while (seconds > 60){
                                    seconds -= 60;
                                    minutes += 1;
                                }

                                System.out.printf("call ended. duration: %02d:%d", minutes, seconds);
                                System.out.println();
                            }
                        }
                        if (namesToCall[1].equals(names[i])){
                            System.out.println("calling " + phoneNumbers[i] + "...");

                            if (sumOfDigits % 2 == 1){
                                System.out.println("no answer");
                            }
                            else {
                                long seconds = sumOfDigits;
                                int minutes = 0;

                                while (seconds > 60){
                                    seconds -= 60;
                                    minutes += 1;
                                }

                                System.out.printf("call ended. duration: %02d:%d", minutes, seconds);
                                System.out.println();
                            }

                        }
                    }
                    break;

                case "message":
                    for (int i = 0; i < names.length; i++) {

                        long phoneDigits = Long.parseLong(phoneNumbersToCalculate[i]);
                        long diffOfDigits = 0;

                        while (phoneDigits > 0) {
                            long lastDigit = phoneDigits % 10;
                            diffOfDigits -= lastDigit;
                            phoneDigits /= 10;
                        }

                        for (int j = 0; j < names.length; j++) {

                        if (namesToCall[1].equals(names[j])){
                            System.out.println("sending sms to " + phoneNumbers[i] + "...");
                            if (diffOfDigits % 2 == 1){
                                System.out.println("busy");
                            }
                            else if (diffOfDigits % 2 == 0){
                                System.out.println("meet me there");
                            }
                        }
                        }
                    }
                    break;
            }

            if (namesToCall[0].equals("done")){
                break;
            }
        }
    }
}