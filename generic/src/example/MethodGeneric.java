package example;

class Util1 {
    public static<T> void getInfo(T data) {
        System.out.println(data);
    }
}
class Util2 {
    public static<V> V getInfo(V data) {
        System.out.println(data instanceof V);
        return (V) "data";
    }
}
class Util3 {
    //T extends Number meaning that we want only number to sum
    //if we do not do this it doesn't know what to sum
    // so this is call-bounded type in generic scope
    public static<T extends Number> Number sum(T a, T b) {
        return a.doubleValue()+b.doubleValue();
    }
}
public class MethodGeneric {
    public static void main(String[] args) {
        Util1.<Integer>getInfo(2); // ✅ Now this works
        Util1.getInfo("Hello");// You can also omit <T>, Java infers it
        Util1.getInfo(new String[]{"Hello", "World"});

        //sum overloading method different parameter
        Number number1 = Util3.sum(1,2);
        Number number2 = Util3.sum(1.3,1.2);
        System.out.println(number1);
        System.out.println(number2);

    }
}
