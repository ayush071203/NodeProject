package Map;

import java.util.*;

public class BirthMonthSimulation {

    public static void main(String[] args) {
        Random random = new Random();
        Map<String, List<Integer>> monthMap = new HashMap<>();

        // Initialize map with month names (Jan 92 to Dec 93)
        String[] months = {
            "Jan 92", "Feb 92", "Mar 92", "Apr 92", "May 92", "Jun 92",
            "Jul 92", "Aug 92", "Sep 92", "Oct 92", "Nov 92", "Dec 92",
            "Jan 93", "Feb 93", "Mar 93", "Apr 93", "May 93", "Jun 93",
            "Jul 93", "Aug 93", "Sep 93", "Oct 93", "Nov 93", "Dec 93"
        };

        // Initialize the map with empty lists for each month
        for (String month : months) {
            monthMap.put(month, new ArrayList<>());
        }

        // Generate and assign birth months for 50 individuals
        for (int i = 1; i <= 50; i++) {
            int randomMonthIndex = random.nextInt(24); // 0 to 23 (24 months)
            String birthMonth = months[randomMonthIndex];
            monthMap.get(birthMonth).add(i); // Add individual to the corresponding month
        }

        // Print the results
        System.out.println("Individuals with Birthdays in the Same Month:");
        for (Map.Entry<String, List<Integer>> entry : monthMap.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
