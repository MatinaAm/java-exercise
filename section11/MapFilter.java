package section11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapFilter {

    public static <K, V> Map<K, V> filterMap(Map<K, V> map, List<K> keys) {
        Map<K, V> filteredMap = new HashMap<>();
        for (K key : keys) {
            if (map.containsKey(key)) {
                filteredMap.put(key, map.get(key));
            }
        }
        return filteredMap;
    }

    public static void main(String[] args) {

        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("A", 1);
        sampleMap.put("B", 2);
        sampleMap.put("C", 3);

        List<String> keyList = List.of("A", "C");

        Map<String, Integer> result = filterMap(sampleMap, keyList);

        System.out.println(result); // خروجی: {A=1, C=3}
    }
}