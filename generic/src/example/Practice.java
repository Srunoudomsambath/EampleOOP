package example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
//generic class
class Bucket<T>{
    private final T data;
    //constructor with parameter for defining the value of data
    public static <T> void getInfo(T data){
        System.out.println("Hello i am data of generic Integer : " + data);
    }
}
public class Practice {
    public static void main(String[] args) {
        Bucket.getInfo("San Francisco");
        Bucket.getInfo(2);
        Bucket.getInfo(3.4);
        Bucket.getInfo(new Object());

    }
}
