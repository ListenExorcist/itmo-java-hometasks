package ru.itmo.homeworks.hw10.employee;

import java.util.Comparator;
import java.util.List;

public class EmployeeTask {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.employeeGenerator(50);
        System.out.println(employeeList);
        employeeList.sort(new NameComparator());
        System.out.println(employeeList);
        employeeList.sort(new NameSalaryComparator());
        System.out.println(employeeList);
        employeeList.sort(new NameSalaryAgeCompanyComparator());
        System.out.println(employeeList);
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class NameSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getName().compareTo(o2.getName()) != 0) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return o1.getSalary() - o2.getSalary();
        }
    }
}

class NameSalaryAgeCompanyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getName().compareTo(o2.getName()) != 0) {
            return o1.getName().compareTo(o2.getName());
        } else if (o1.getSalary() != o2.getSalary()) {
            return o1.getSalary() - o2.getSalary();
        } else if (o1.getAge() != o2.getAge()) {
            return o1.getAge() - o2.getAge();
        } else {
            return o1.getCompany().compareTo(o2.getCompany());
        }
    }
}