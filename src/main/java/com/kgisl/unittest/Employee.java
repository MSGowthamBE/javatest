package com.kgisl.unittest;

/**
 * Stud1
 */
public class Employee {

    int empid;
    String name, dept;
    float salary;

    public Employee(int empid, String name, String dept, float salary) {
        this.empid = empid;

        this.name = name;

        this.dept = dept;

        this.salary = salary;
    }

    public int getEmpId() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public String getDept() {

        return dept;

    }

    public float getSalary() {

        return salary;

    }

    @Override

    public String toString() {

        return "\nId:   " + empid + "\nName:   " + name + "\nDepartment:   " + dept + "Salary:  " + salary;

    }

}