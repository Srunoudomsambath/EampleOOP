package map;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;
import java.util.TreeMap;


@AllArgsConstructor
@Data
class Person implements Comparable<Person>{
    private Integer id;
    private String name;
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
        //return this.id.compareTo(o.id);
    }
}
@AllArgsConstructor
@Data
class House{
    private Integer id;
    private String houseName;
}
public class CompareObj {
    public static void main(String[] args) {
        Map<Person, House> personHouseMap = new TreeMap<>();
        personHouseMap.put(new Person(1,"Taiyi"),new House(1,"khmer"));
        personHouseMap.put(new Person(2,"Sambath"),new House(2,"thao"));
        System.out.println(personHouseMap);
    }
}
