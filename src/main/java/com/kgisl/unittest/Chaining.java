package com.kgisl.unittest;

/**
 * Chaining
 */
public class Chaining {
    public int empid;
    public String name;
    public float salary;

    public Chaining(int empid, String name, float salary)
    {
    	this.empid=empid;
    	this.name=name;
    	this.salary=salary;
    }

    public Chaining()
    {

        this(1246);
        
    }


    public Chaining(int empid)
    {
    	
    	this(empid, 12000);
    }

    public Chaining(int empid, float salary){

        this(empid, "Gowtham", salary);

    }

    void display() {
    	System.out.println("ID:    "+empid);
    	System.out.println("Name:  "+name);
    	System.out.println("Salary:   "+salary);
    }

    public static void main(String[] args)
    {
        Chaining var = new Chaining();
        var.display();
    }
}