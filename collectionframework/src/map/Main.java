package map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Map<String, Integer> map0 = Map.of(1,"value"); read only it's mean that we can not add or remove
    Map<Integer, String> map = new HashMap<>(
            Map.of(1,"anna",2,"Lin")
    );
    map.put(3,"Anna");
    map.put(5,"Sambath");
    map.remove(3);
    for(Map.Entry<Integer, String> entry : map.entrySet()){
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
        System.out.println(map);
    }

}
