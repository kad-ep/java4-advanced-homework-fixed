import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //added list with different type values for task2
        List list1 = new ArrayList();
        String[] arr1 = {"el1", "el2", "el3"};
        list1.add(arr1);
        list1.add(arr1);
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add('3');
        list1.add('4');
        list1.add("5");

        // added hashmap for task 3
        Map map1 = new HashMap();
        map1.put("1", 10);
        map1.put("2", "two");
        map1.put("3", 33);
        map1.put(4, arr1);

        // added string array for task 4
        String[] orders = {"Product1: 5$", "Product2: 10$", "Product3: 7$", "Product4: 4$", "Product5: 15$", "Product1: 5$"};

        // arrays for task 5
        String[] keys =  {"Key1", "Key2", "key3", "key4"};
        String[] values = {"value1", "value2", "value3", "value4", "value5", "value6"};

        // Output
        System.out.println("\ntask 1 - Frequency dictionary");
        System.out.println(Task1.getDict("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(Task1.getDict("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"));

        System.out.println("\ntask 2 ");
        System.out.println("Input list with duplicates: " + list1);
        System.out.println("Output Set without duplicates: " + Task2.convertListToSet(list1));

        System.out.println("\ntask 3 ");
        System.out.println("Input map: " + map1);
        System.out.println("Replaced keys and values map: " +Task3.keysToValues(map1));

        System.out.println("\ntask 4 ");
        System.out.println("Orders array: " + showArray(orders));
        System.out.println("Orders to HashSet: " + Task4.ordersHash(orders));
        System.out.println("Orders to TreeSet: " + Task4.ordersTree(orders));

        System.out.println("\ntask 5 - option 1");
        System.out.println("array1: " + showArray(keys));
        System.out.println("array2: " + showArray(values));
        System.out.println("K < V : " + Task5.arrsToMapOption1(keys, values));
        System.out.println("K > V : " + Task5.arrsToMapOption1(values, keys));

        System.out.println("\ntask 5 - option 2");
        System.out.println("K < V : " + Task5.arrsToMapOption2(keys, values)); //comment this line
//        System.out.println("K > V : " + Task5.arrsToMapOption2(values, keys));  // and uncomment this to see K>V case

    }

    //for better arrays readability:
    public static <T> List<T> showArray(T arr[]){
        List<T> list = Arrays.asList(arr);
        return list;
    }

}