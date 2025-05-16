package set.foodsystem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
@Builder
@AllArgsConstructor
@Data
class Product{
    private Integer id;
    private String name;
    private LocalDate expDate;
    private Set<Category> categories;
}
enum  Category{
    DRINK,
    FOOD,
    FAST_FOOD,
    VEGETABLE,
}
public class Main {
    public static void main(String[] args) {
        Set<Category> categories = new HashSet<>(
                Set.of(Category.FOOD, Category.FAST_FOOD));
        Product burger = new Product(1,"Burger",LocalDate.of(1990,1,1),categories);
        Product pizza = new Product(2,"Pizza",LocalDate.of(1990,1,1),categories);
        Set<Product> products = new HashSet<>();
        products.add(burger);
        products.add(pizza);

        products.stream().filter(p->p.getCategories()
                .equals(EnumSet.of(Category.FOOD, Category.FAST_FOOD))
        ).forEach(System.out::println);
    }
}
