package map;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Entry {
    public static void main(String[] args) {
        Map<String, Double> score= new TreeMap<>();
        score.put("Alice",50.5);
        score.put("Bob",100.5);
        score.put("Charlie",40.5);
        //score
        score.remove("key");
        score.remove("Bob",0);
        //
        List<String> values = score.entrySet()
                .stream()
//                .filter(e->e.getValue()>=50)
//                .map(e->e.getKey()+ ":Pass")
                .map(e->e.getValue()>=50 ? e.getKey()+ ":Pass" :e.getKey()+ ":Fail")
                .toList();
        System.out.println(values);
    }
}
