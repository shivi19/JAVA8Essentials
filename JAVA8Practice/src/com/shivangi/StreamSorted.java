package com.shivangi;

import com.shivangi.POJO.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamSorted
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(67,56,78,8, 1, 101,23, 345);
        // default sorting
        List<Integer> sorted = nums.stream().sorted().collect(Collectors.toList());

        sorted.forEach(integer -> System.out.println(integer));

        Employee employee1 = new Employee("varsha", "refdata", 10000);
        Employee employee2 = new Employee("priya", "mpage", 200000);
        Employee employee3 = new Employee("saylee", "mpage", 90);
        Employee employee4 = new Employee("neha", "refdata", 10000001);
        Employee employee5 = new Employee("aditi", "mpage", 10000201);

        // custom sorting
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        // create a map of employee name and employee object from a list of employee
        Map<String, Employee> dummyMap = employeeList.stream().collect(Collectors.toMap(i->i.getEmployeeName(), x->x,(oldValue, newValue) -> newValue,
                LinkedHashMap::new));

        dummyMap.forEach((x,y) -> System.out.println(x+" employee "+y));

        // sort the employee object list based on the employee name
        List<Employee> sortedName = employeeList.stream().sorted((a,b) -> a.getEmployeeName().compareTo(b.getEmployeeName())).collect(Collectors.toList());
        sortedName.forEach(integer -> System.out.println(integer.getEmployeeName()));
    }
}
