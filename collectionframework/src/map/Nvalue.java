package map;

import java.util.*;

public class Nvalue {
    public static void main(String[] args) {
        Map<String, Double> score= new TreeMap<>();
        score.put("Alice",50.5);
        score.put("Bob",100.5);
        score.put("Charlie",40.5);

        score.compute("Alice",(o,n)->{
            return n+10;
        });
        score.computeIfAbsent("Alice",(v)->{
            System.out.println("Insert score : ");
            double math = new Scanner(System.in).nextDouble();
            System.out.println("Insert Score : ");
            double english = new Scanner(System.in).nextDouble();
            System.out.println("Insert Score : ");
            double java = new Scanner(System.in).nextDouble();
            return (math + english+java)/3;
        });
        System.out.println(score);
    }
}
