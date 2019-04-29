package com.kgisl.unittest;

/**
* Employee
*/
public class Emp {

   private int empid;
   private String name;
   private String dept;
   private float salary;
   

   public Emp(int empid, String name, String dept, float salary) {

       this.empid = empid;
       this.name = name;
       this.dept=dept;
       this.salary = salary;

   }

   public int getEmpid() {
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

   public String toString() {
       return "ID : " + empid+  "    Name:   " + name+"Department: "+ dept+"   Salary:   " + salary;
   }

}