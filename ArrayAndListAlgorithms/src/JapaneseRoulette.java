import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JapaneseRoulette {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> gunCylinder = Arrays.asList(console.nextLine().split(" "));
        List<String> rotationForEachPlayer = Arrays.asList(console.nextLine().split(" "));

        int initialPosition = 0;
        int endPosition = 0;
        boolean someoneHasDied = false;

        for (int i = 0; i < gunCylinder.size(); i++) {

            if (Integer.parseInt(gunCylinder.get(i)) == 1){
                initialPosition = i;
            }
        }

        for (int i = 0; i < rotationForEachPlayer.size(); i++) {
            someoneHasDied = false;
            String[] rotationParams = rotationForEachPlayer.get(i).split(",");
            int strength = Integer.parseInt(rotationParams[0]);
            String direction = rotationParams[1];

            switch (direction){
                case "Left":
                    endPosition = (initialPosition + strength) % gunCylinder.size();
                    initialPosition = endPosition;
                    break;
                case "Right":
                    endPosition = (initialPosition - strength) % gunCylinder.size();
                    if (endPosition < 0){
                        endPosition += gunCylinder.size();
                    }
                    initialPosition = endPosition;
                    break;
            }

            if (endPosition == 2){
                System.out.println("Game over! Player " + i + " is dead.");
                someoneHasDied = true;
                break;
            }

            initialPosition++;
        }

        if (!someoneHasDied){
            System.out.println("Everybody got lucky!");
        }

    }
}
