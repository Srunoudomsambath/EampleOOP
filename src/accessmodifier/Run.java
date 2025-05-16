package accessmodifier;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Run {

    static Employee[] employees = new Employee[10];
    static int count = 0;

    public static void main(String[] args) {
        add(new Employee(1, UUID.randomUUID().toString(), "Koko", "koko@gmail.com", "google.com", LocalDate.now(), new BigDecimal("30000"), EmployeePosition.MARKETING));
        add(new Employee(2, UUID.randomUUID().toString(), "Dara", "dara@gmail.com", "dara.com", LocalDate.now(), new BigDecimal("45000"), EmployeePosition.SALE));
        add(new Employee(3, UUID.randomUUID().toString(), "Linda", "linda@gmail.com", "linda.com", LocalDate.now(), new BigDecimal("60000"), EmployeePosition.MANAGER));

        showAll();
        updateById(1, "Koko Updated", "koko2024@gmail.com");

        System.out.println("After update");
        System.out.println("=".repeat(50));
        showAll();
        deleteById(2);
        System.out.println("After delete");
        System.out.println("=".repeat(50));
        showAll();
        searchById(1);
        System.out.println("After search");
        System.out.println("=".repeat(50));
        showAll();
    }
    static void add(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            System.out.println("Added: " + emp.getName());
        }
    }
    static void showAll() {
        System.out.println("\nEmployee List:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }
    static void updateById(int id, String newName, String newEmail) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i].setName(newName);
                employees[i].setEmail(newEmail);
                System.out.println("Updated ID: " + id);
                return;
            }
        }
        System.out.println("ID not found.");
    }
    static void deleteById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                System.out.println("Deleted ID: " + id);
                return;
            }
        }
        System.out.println("ID not found.");
    }
    static void searchById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                System.out.println("Found: " + employees[i]);
                return;
            }
        }
        System.out.println("ID not found.");
    }

}
