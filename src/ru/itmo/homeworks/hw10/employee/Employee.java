package ru.itmo.homeworks.hw10.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;

    public Employee(String name, String company, int salary, int age) {
        setName(name);
        setCompany(company);
        setSalary(salary);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Illegal name");
        }
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company == null || company.equals("")) {
            throw new IllegalArgumentException("Illegal company");
        }
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 1000) {
            throw new IllegalArgumentException("Illegal salary");
        }
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 21 || age > 60) {
            throw new IllegalArgumentException("Illegal age");
        }
        this.age = age;
    }

    public static List<Employee> employeeGenerator(int num) {
        if (num <= 0) {
            return Collections.emptyList();
        }

        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        ArrayList<Employee> employees = new ArrayList<>(num);
        Random random = new Random();

        for (int i = 0; i < num; i++) {
            employees.add(new Employee(names[random.nextInt(names.length)], companies[random.nextInt(companies.length)], 1000 + random.nextInt(20) * 1000, 21 + random.nextInt(40)));
        }

        return employees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", age=" + age +
                ", company=" + company +
                ", salary=" + salary +
                '}';
    }
}
