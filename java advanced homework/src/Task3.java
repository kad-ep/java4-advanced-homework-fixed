import java.util.*;

public class Task3 {

    public static <K, V> LinkedHashMap<V,K> keysToValues(Map<K, V> map){
        LinkedHashMap<V, K> reversed = new LinkedHashMap<V, K>();
        for (Map.Entry<K, V> entry: map.entrySet()) {
            reversed.put(entry.getValue(), entry.getKey());
        }
        return reversed;
    }

}
