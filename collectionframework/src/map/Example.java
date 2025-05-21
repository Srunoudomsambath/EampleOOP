//package map;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.function.BiFunction;
//
//public class Example{
//    public static void main (String[] args){
//        Map<String ,Long> account = new HashMap<>();
//        BiFunction<Long,Long,Long> logic = (oldValue,newValue)->{
//            return oldValue+newValue;
//        } ;
//
//        account.put("1234-1234-1234-1234",100l);
//        account.merge("1234-1234-1234-1234",200l,logic);
//        System.out.println(account);
//    }
//}
