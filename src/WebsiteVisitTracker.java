import java.util.*;

public class WebsiteVisitTracker {

    public static void main(String[] args) {

        // Map: Page → Visit Count
        Map<String, Integer> visitMap = new HashMap<>();

        // Simulated page visits
        String[] visits = {
                "home", "about", "products", "home",
                "products", "contact", "home", "home",
                "about", "products"
        };

        // 1️⃣ Count visits
        for (String page : visits) {
            visitMap.put(page, visitMap.getOrDefault(page, 0) + 1);
        }

        // Print raw map
        System.out.println("Visit Counts: " + visitMap);

        // 2️⃣ Sort pages by DESCENDING visit count
        System.out.println("\nPages Sorted by Visit Count (Descending):");

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(visitMap.entrySet());

        sortedList.sort((a, b) -> b.getValue() - a.getValue());  // descending order

        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 3️⃣ Find the MOST visited page
        String mostVisited = null;
        int maxCount = -1;

        for (Map.Entry<String, Integer> entry : visitMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostVisited = entry.getKey();
            }
        }

        System.out.println("\nMost Visited Page: " + mostVisited + " (" + maxCount + " visits)");
    }
}
