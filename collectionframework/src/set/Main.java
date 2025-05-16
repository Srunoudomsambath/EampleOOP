package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(
                Set.of(1,2,3,4,5)
        );
        set.add(2);
        set.add(3);

        set.remove(2);
        set.removeIf(e->e>0);
        System.out.println(set);

    }
}
