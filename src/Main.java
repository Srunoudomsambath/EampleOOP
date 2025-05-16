import model.Product;
import model.ProductCategory;

import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Product coca = new Product(1,"sambath",UUID.randomUUID().toString(),
                "This is coca",
                LocalDate.now(),
                LocalDate.of(2030,12,03),
                new String[]{"https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Coca_Cola_Flasche_-_Original_Taste.jpg/960px-Coca_Cola_Flasche_-_Original_Taste.jpg"},
                new ProductCategory[]{ProductCategory.DRINK});
        System.out.println(coca);

        Product fanta = new Product(2,"fanta",UUID.randomUUID().toString(),
                "This is fanata",
                LocalDate.now(),
                LocalDate.of(2040,12,4),
                new String[]{"https://images2.minutemediacdn.com/image/upload/c_fill,w_1200,ar_4:3,f_auto,q_auto,g_auto/shape/cover/sport/iStock-487787108-3f77e523663f73c106cbcb81834a4248.jpg"},
                new ProductCategory[]{ProductCategory.DRINK});
        System.out.println(fanta);

    }
}
