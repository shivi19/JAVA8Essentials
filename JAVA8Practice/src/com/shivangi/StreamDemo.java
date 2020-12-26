package com.shivangi;

import com.shivangi.POJO.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("varsha", "refdata", 10000);
        Employee employee2 = new Employee("priya", "mpage", 200000);
        Employee employee3 = new Employee("saylee", "mpage", 90);
        Employee employee4 = new Employee("shiv", "refdata", 10000001);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        Map<String, Employee> stringEmployeeMap = employeeList.stream().
                                                 collect(Collectors.groupingBy(e->e.getDepartment(),
                                                         Collectors.collectingAndThen(Collectors.maxBy
                                                                 (Comparator.comparingDouble(e->e.getSalary())), Optional::get)));

        stringEmployeeMap.forEach((k, v) -> System.out.println((k + ":" + v.getSalary())));

        Map<Long, Long> deptCount = employeeList.stream().
                                      collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()));

        deptCount.forEach((k, v) -> System.out.println((k + ":" + v)));

        Map<String, List<Employee>> deptGroup = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment()));

        deptGroup.forEach((k, v) -> System.out.println((k + ":" + v)));
    }

    @Override
    public String toString() {
        return "StramDemo{}";
    }
}
