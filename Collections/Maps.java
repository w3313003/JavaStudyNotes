package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "zj");
        map.put("age", 123);
        map.put("name", "test");
        map.putIfAbsent("age", ((int) map.getOrDefault("age", 0)) + 1);
        System.out.println(map.getOrDefault("nasme", 0));
        map.forEach((k, v) -> System.out.println("key:" + k + "," + "value:" + v));
        Set<Map.Entry<String, Object>> set = map.entrySet();
        System.out.println(set);
    }
}
