package ru.itmo.homeworks.hw10.employee;

import java.util.Comparator;
import java.util.List;

public class EmployeeTask {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.employeeGenerator(50);
        System.out.println(employeeList);
        employeeList.sort(new NameComparator());
        System.out.println(employeeList);
        employeeList.sort(new NameComparator().thenComparing(new SalaryComparator()));
        System.out.println(employeeList);
        employeeList.sort(new NameComparator()
                .thenComparing(new SalaryComparator())
                .thenComparing(new AgeComparator())
                .thenComparing(new CompanyComparator()));
        System.out.println(employeeList);
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();
    }
}

class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}

class CompanyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCompany().compareTo(o2.getCompany());
    }
}