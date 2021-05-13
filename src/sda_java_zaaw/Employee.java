package sda_java_zaaw;

import java.util.*;
import java.util.stream.Collectors;

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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Nowak", 35000));
        employees.add(new Employee(2, "Kowal", 30000));
        employees.add(new Employee(3, "Man", 1000));

        Employee employee = employees.stream()
                .findFirst()
                .filter(Objects::nonNull)
                .filter(e -> e.getSalary() > 30000)
                .orElseThrow(() -> new RuntimeException("not found"));

        System.out.println(employee.getName());


        /**
         * sortowanie po na name
         */

        List<Employee> employeeSort = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        employeeSort.forEach(System.out::println);

        System.out.println("============");
        System.out.println("============");
        System.out.println("============");

        Long employeeMaxSalary = employees.stream()
                .map(Employee::getSalary)
                .max(Comparator.naturalOrder())
                .orElseThrow(NoSuchElementException::new);

        System.out.println(employeeMaxSalary);
    }
}


