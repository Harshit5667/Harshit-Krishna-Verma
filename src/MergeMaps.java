import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> merged = mergeMaps(map1, map2);
        System.out.println(merged);
    }

    public static Map<String, Integer> mergeMaps(Map<String, Integer> m1, Map<String, Integer> m2) {
        Map<String, Integer> result = new HashMap<>(m1);  // copy first map

        for (Map.Entry<String, Integer> entry : m2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            // Sum values if key exists
            result.put(key, result.getOrDefault(key, 0) + value);
        }

        return result;
    }
}
