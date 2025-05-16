
package practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Airplane {
    private int id;
    private String uuid;
    private String name;
    private int wheel;
    private int wing;
    private LocalDate createdDate;
    private String brand;
    private int numberOfPeople;
    @Override
    public String toString() {
        return "Airplane{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", wheel=" + wheel +
                ", wing=" + wing +
                ", createdDate=" + createdDate +
                ", brand='" + brand + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.setId(1);
        airplane.setName("Boeing");
        airplane.setWheel(3);
        airplane.setWing(2);
        airplane.setCreatedDate(LocalDate.of(2020, 1, 1));
        airplane.setBrand("Lexus");
        airplane.setNumberOfPeople(2);
        System.out.println(airplane);
    }
}
