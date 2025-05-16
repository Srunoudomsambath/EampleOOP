//@FunctionalInterface
//interface Loop<T>{
//    void process(T[] objects);
//}
//class ArrayPrinter<T>{
//    private T[] strings;
//    public void foreach(Loop<T> loop){
//        loop.process(strings);
//    }
//    public void setArray(T[] strings){
//        this.strings = strings;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        String [] names = {"ratha","seavthong"};
//        ArrayPrinter<String> arraysPrinter = new ArrayPrinter<>();
//        arraysPrinter.setArray(names);
//        arraysPrinter.foreach((e)->{
//            for (String s :e) {
//                System.out.println(s);
//            }
//            });
//        }
//    }
//}