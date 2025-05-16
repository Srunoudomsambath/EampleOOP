package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add(0,"sambath");
//        remove
//        names.remove("Bob");
//        names.remove(1);
//        names.removeIf(e -> e.equals("sambath"));
        //access elements
        System.out.println(names.get(1));
//        for(String item :names){
//            System.out.println(item);
//        }
        System.out.println(names);

        //stream api is feature in java 8 to do operation in java such as
        //filter and map
        List<String> result = names.stream().filter(e->e.startsWith("J"))
                .map(e->e.toUpperCase())
                        .toList();
        System.out.println(result);
        names.stream().filter(e->e.startsWith("J"))
                .map(e->e.toUpperCase())
                .forEach(e->System.out.println(e));

    }
}
