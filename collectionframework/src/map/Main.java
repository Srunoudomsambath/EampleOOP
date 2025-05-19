package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Map<String, Integer> map0 = Map.of(1,"value"); read only it's mean that we can not add or remove
        Map<Integer, String> map = new HashMap<>(
                Map.of(1,"anna",2,"Lin")
        );
        map.put(10,"Anna");
        map.put(5,"Sambath");
        map.putAll(Map.of(7,"Anna",3,"Nha"));
        //remove
        map.remove(3,"Nha");
        map.remove(10);
        //value
        Collection<String> values = map.values();//get all values
        Set<Integer> keys = map.keySet();//get all keys
        System.out.println("===================\nThis is the output of Value");
        System.out.println(values);
        System.out.println("===================\nThis is the output of Keys");
        System.out.println(keys);
        //
        System.out.println("===================\nThis is the Boolean");
        boolean contains = map.containsValue("Lin");
        boolean contains2 = map.containsKey(5);
        System.out.println(contains);
        System.out.println(contains2);

        //print
        System.out.println("===================\nThis is the entry map");
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("===================\nPrinting key and value map\n================");
            System.out.println(map);
        }

}
