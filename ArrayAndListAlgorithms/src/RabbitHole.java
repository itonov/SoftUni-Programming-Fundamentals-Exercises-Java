import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RabbitHole {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> obstacles = new LinkedList<>(Arrays.asList(console.nextLine().split(" ")));
        int initialEnergy = Integer.parseInt(console.nextLine());

        int index = 0;
        boolean hasTriggeredBomb = false;

        while (initialEnergy > 0){
            String[] direction = obstacles.get(index).split("\\|");
            String command = direction[0];

            if (command.equals("RabbitHole")){
                System.out.println("You have 5 years to save Kennedy!");
                break;
            }

            int neededEnergy = Integer.parseInt(direction[1]);
            hasTriggeredBomb = false;

            switch (command){
                case "Bomb":
                    initialEnergy -= neededEnergy;
                    index = 0;
                    hasTriggeredBomb = true;
                    break;
                case "Left":
                    initialEnergy -= neededEnergy;
                    index = (index + neededEnergy) % obstacles.size();
                    break;
                case "Right":
                    initialEnergy -= neededEnergy;
                    index = Math.abs(index - neededEnergy) % obstacles.size();
                    break;
            }

            if (!obstacles.get(obstacles.size() - 1).equals("RabbitHole")){
                obstacles.remove(obstacles.size() - 1);
            }

            obstacles.add("Bomb");
        }

        if (initialEnergy <= 0 && hasTriggeredBomb){
            System.out.println("You are dead due to bomb explosion!");
        }
        else if (initialEnergy <= 0){
            System.out.println("You are tired. You can't continue the mission.");
        }
    }
}
