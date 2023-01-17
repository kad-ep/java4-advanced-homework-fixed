import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
    public static Set ordersHash(String[] arr){
        Set ordersHashSet = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            ordersHashSet.add(arr[i]);
        }
        return ordersHashSet;

    }

    public static Set ordersTree(String[] arr){
        Set ordersTreeSet = new TreeSet();
        for (int i = 0; i < arr.length; i++) {
            ordersTreeSet.add(arr[i]);
        }
        return ordersTreeSet;
    }

}
