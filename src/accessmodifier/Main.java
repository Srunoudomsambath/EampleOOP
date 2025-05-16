package accessmodifier;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    static Employee[] emps = new Employee[10];
    static int counter = 0;
    static Scanner sc = new Scanner(System.in);
    static void printMenu(){
        System.out.println("=============== Employee Menu ==============");
        System.out.println("1. Add Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Delete Employee");
        System.out.println("4. Search Employee");
        System.out.println("5. List Employee");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }
    static Employee getEmployee() {
        System.out.print("Enter employee id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee email: ");
        String email = sc.nextLine();
        System.out.print("Enter employee profile: ");
        String profile = sc.nextLine();
        System.out.print("Enter employee salary: ");
        BigDecimal salary = sc.nextBigDecimal();
        sc.nextLine();

        System.out.print("Enter employee position MANAGER, SALE, MARKETING: ");
        String pos = sc.nextLine().toUpperCase();

        EmployeePosition position = EmployeePosition.valueOf(pos);
        return new Employee(id, UUID.randomUUID().toString(), name, email, profile, LocalDate.now(), salary, position);
    }

    static void addEmployee(){
        if(counter >= emps.length){
            System.out.println("Employees list is full");
            return;
        }
        Employee emp = getEmployee();
        emps[counter++] = emp;
        System.out.println("Employee added");
    }
    static void updateEmployee(){
        System.out.println("Enter employee id: ");
        int id = sc.nextInt();
        for(int i =0 ;i<counter;i++){
            if(emps[i].getId() == id){
                Employee emp = getEmployee();
                emps[i] = emp;
                System.out.println("Employee updated");
                return;
            }
        }
        System.out.println("Employee not found");
    }
    static void deleteEmployee(){
        System.out.println("Enter employee id to delete: ");
        int id = sc.nextInt();
        for(int i =0 ;i<counter;i++){
            if(emps[i].getId() == id){
                for(int j = i;j<counter-1;j++){
                    emps[j] = emps[j+1];
                }
                emps[counter-1] = null;
                System.out.println("Employee deleted");
                return;
            }
        }
        System.out.println("Employee not found");
    }
    static void searchEmployee(){
        System.out.println("Enter employee UUID to search: ");
        String uuid = sc.next();
        for(int i =0 ;i<counter;i++){
            if(emps[i].getUuid().equals(uuid)){
                System.out.println(emps[i]);
                return;
            }
        }
        System.out.println("Employee not found");
    }
    static void listEmployee(){
        if(counter == 0){
            System.out.println("No employee found");
        }else{
            for(int i =0 ;i<counter;i++){
                System.out.println(emps[i]);
            }
        }
    }
    public static void main(String[] args) {
        while(true) {
            printMenu();
            int choice = sc.nextInt();
           switch(choice) {
                case 1 -> addEmployee();
                case 2 -> updateEmployee();
                case 3 -> deleteEmployee();
                case 4 -> searchEmployee();
                case 5 -> listEmployee();
                case 6 -> {
                    System.out.println("Exit program");
                    return;
                }
                default -> System.out.println("Invalid choice");

           }
           }
    }
}
