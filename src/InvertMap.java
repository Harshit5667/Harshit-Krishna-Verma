import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        Map<Integer, List<String>> inverted = invertMap(map);

        System.out.println(inverted);
    }

    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> result = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            // If value is not present, create new list
            result.putIfAbsent(value, new ArrayList<>());

            // Add key to the list
            result.get(value).add(key);
        }

        return result;
    }
}
