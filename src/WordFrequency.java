import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";

        // Convert to lowercase and remove punctuation
        text = text.toLowerCase().replaceAll("[^a-z0-9 ]", "");

        // Split into words
        String[] words = text.split("\\s+");

        // HashMap to store frequency
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (word.length() == 0) continue;  // skip empty
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
