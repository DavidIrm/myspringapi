package ro.developmentfactory.myspringapi;

import javax.persistence.*;

@Entity
@Table(name ="employees")

public class Employee {

    @Id
    @SequenceGenerator(
            name ="employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "employee_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private String firstName;
    private String name;
    private int age;
    private String emailAddres;
    private String address;
    private String role;

    public Employee(){};

    public Employee(String firstName, String name, int age, String emailAddres, String address, String role) {
        this.firstName = firstName;
        this.name = name;
        this.age = age;
        this.emailAddres = emailAddres;
        this.address = address;
        this.role = role;
    }

    public Long getId(){
        return id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddres() {
        return emailAddres;
    }

    public void setEmailAddres(String emailAddres) {
        this.emailAddres = emailAddres;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
