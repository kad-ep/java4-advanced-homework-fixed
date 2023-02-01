
import java.util.*;

public class Task5 {

    //option 1
    public static <K, V> Map<K, V> arrsToMapOption1(K[] arr1, V[] arr2){
        LinkedHashMap<K, V> map = new LinkedHashMap<K, V>();
        if (arr1.length > arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (i < arr2.length){
                    map.put(arr1[i], arr2[i]);
                }
                else {
                    map.put(arr1[i], null);
                }
            }
        }
        else {
            for (int i = 0; i < arr2.length; i++) {
                if (i < arr1.length){
                    map.put(arr1[i], arr2[i]);
                }
                else {
                   break;
                }
            }
        }
        return map;
    }

    //option 2
    public static <K, V> Map<K, V> arrsToMapOption2(K[] arr1, V[] arr2) throws Exception {
        LinkedHashMap<K, V> map = new LinkedHashMap<K, V>();
        if (arr1.length < arr2.length){
            throw new Exception("Key is not enough for map"); //added this because K<V case doesn't throw any exception by default
        }
        try {
            for (int i = 0; i < arr1.length; i++) {
                map.put(arr1[i], arr2[i]);
            }
        } catch (Exception e) {

            throw new Exception("Value is not enough for map");
        }

        return map;
    }

}
