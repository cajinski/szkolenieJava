package Models;

public class Person {
    private String firstName;
    private String lastName;
    private int salary;
    private int quantity;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getQuantity() {
        return quantity;
    }

    public Person(String firstName, String lastName, int salary, int quantity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.quantity = quantity;


    }
}
