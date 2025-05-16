package example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
class Util<T>{
    private final T content;
}

public class Generic1 {
    public static void main(String[] args) {
        Util<String> util = new Util<>("Hello World");
        System.out.println(util.getContent());
        Util<Integer> util2 = new Util<>(10);
        System.out.println(util2.getContent());
    }
}
