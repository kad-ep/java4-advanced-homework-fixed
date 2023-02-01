import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
public class Task1 {
    public static Map getDict(String s){
        //create an alphabet map and fill it with alphabetical symbols
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 0);
        map.put("b", 0);
        map.put("c", 0);
        map.put("d", 0);
        map.put("e", 0);
        map.put("f", 0);
        map.put("g", 0);
        map.put("h", 0);
        map.put("i", 0);
        map.put("j", 0);
        map.put("k", 0);
        map.put("l", 0);
        map.put("m", 0);
        map.put("n", 0);
        map.put("o", 0);
        map.put("p", 0);
        map.put("q", 0);
        map.put("r", 0);
        map.put("s", 0);
        map.put("t", 0);
        map.put("u", 0);
        map.put("v", 0);
        map.put("w", 0);
        map.put("x", 0);
        map.put("y", 0);
        map.put("z", 0);

        //loop through input string s and check if the symbol appears in it
        for (int i = 0; i < s.length(); i++) {
            char currentChar =  s.charAt(i);

            //convert current char to string and to lower case
            String c1 = String.valueOf(currentChar).toLowerCase();
            //check if alphabet map contains a current char. if so, increment it's counter in map
            if (map.containsKey(c1)){
                Integer counter = map.get(c1);
                counter++;
                map.put(c1, counter);

            }
        }
        return map;
    }


}
