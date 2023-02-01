import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task2 {

        public static <V> Set<V> convertListToSet(List<V> list)
        {
                return new LinkedHashSet<V>(list);
        }

}
