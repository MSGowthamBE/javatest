package com.kgisl.unittest;

/**
* Employee
*/
public class Employees {

   private int empid;
   private String name;
   private double salary;

   public Employees(int empid, String name, double salary) {

       this.empid = empid;
       this.name = name;
       this.salary = salary;

   }

   public int getEmpid() {
       return empid;
   }

   public String getName() {
       return name;
   }

   public double getSalary() {
       return salary;

   }

   public String toString() {
       return "ID : " + empid+  "    Name:   " + name+ "   Salary:   " + salary;
   }

}