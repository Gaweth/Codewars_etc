package sda_java_zaaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private long salary;

    public Employee(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Jan nowak", 35000));
        employees.add(new Employee(2, "Ewa Kowal", 30000));
        employees.add(new Employee(3, "MArcin man", 1000));

        Employee employee = employees.stream()
                .findFirst()
                .filter(Objects::isNull)
                .filter(e->e.getSalary() > 30000 )
                .orElseThrow(() -> new RuntimeException("not found"));

        System.out.println(employee);
    }
}
