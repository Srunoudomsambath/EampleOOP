package accessmodifier;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
    private Integer id;
    private String uuid;
    private String name;
    private String email;
    private String profile;
    private LocalDate createdDate;
    private BigDecimal salary;
    private EmployeePosition position;
    //constructor
    public Employee(){}
    public Employee(Integer id, String uuid,
                    String name, String email,
                    String profile,
                    LocalDate createdDate,
                    BigDecimal salary,
                    EmployeePosition position) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.email = email;
        this.profile = profile;
        this.createdDate = createdDate;
        this.salary = salary;
        this.position = position;
    }
    @Override
    public String toString() {
        return "Employee{" + "\n" +
                "id=" + id +"\n" +
                "uuid='" + uuid + "\n" +
                "name='" + name + "\n" +
                "email='" + email + "\n" +
                "profile='" + profile + "\n" +
                "createdDate=" + createdDate +"\n" +
                "salary=" + salary +"\n" +
                "position=" + position +"\n" +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getProfile() {
        return profile;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }
}
