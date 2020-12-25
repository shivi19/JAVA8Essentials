package com.shivangi;

public class Employee
{
    String employeeName;
    String department;

    public long getSalary() {
        return Salary;
    }

    long Salary;





    public Employee(String employeeName, String department, long salary)
    {
        this.employeeName = employeeName;
        this.department = department;
        Salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public void setSalary(long salary) {
        Salary = salary;
    }

}
