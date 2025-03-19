package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DieRollSimulation {

    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> dieRollResults = new HashMap<>();

        // Initialize the map with numbers from 1 to 6 and set their count to 0
        for (int i = 1; i <= 6; i++) {
            dieRollResults.put(i, 0);
        }

        boolean stopRolling = false;

        // Roll the die until any number reaches 10 times
        while (!stopRolling) {
            int roll = random.nextInt(6) + 1; // Generate number between 1 to 6
            dieRollResults.put(roll, dieRollResults.get(roll) + 1);

            // Print current roll and counts
            System.out.println("Rolled: " + roll + " -> " + dieRollResults);

            // Check if any number has reached 10 times
            for (int count : dieRollResults.values()) {
                if (count == 10) {
                    stopRolling = true;
                    break;
                }
            }
        }

        // Find the number with maximum and minimum occurrence
        int maxNumber = 0, minNumber = 0;
        int maxCount = Integer.MIN_VALUE, minCount = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : dieRollResults.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                maxNumber = number;
            }
            if (count < minCount) {
                minCount = count;
                minNumber = number;
            }
        }

        // Display Results
        System.out.println("\nFinal Counts: " + dieRollResults);
        System.out.println("Number that reached maximum times: " + maxNumber + " (Count: " + maxCount + ")");
        System.out.println("Number that reached minimum times: " + minNumber + " (Count: " + minCount + ")");
    }
}
