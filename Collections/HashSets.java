package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @散列集
 *
 */
public class HashSets {
    public static void main(String[] args) {
        String[] arr = {"zj", "hym"};
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        Iterator it = set.iterator();
        it.forEachRemaining(i -> System.out.println(i));
    }
}
