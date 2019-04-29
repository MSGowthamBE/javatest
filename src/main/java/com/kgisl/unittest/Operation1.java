package com.kgisl.unittest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Operation1 {

    static ArrayList<Operation> slist = new ArrayList<Operation>();

    public static void main(String[] args) {
        create();
        read();
        update();
        delete();

    }

    static void create() {

        

        slist.add(new Operation(522, "Somu", "EEE", 89000));

        slist.add(new Operation(633, "Raja", "IT", 25000));

        slist.add(new Operation(693, "Ramu", "CSE", 69333));

        slist.add(new Operation(859, "raju", "ECE", 69000));

    }

    private static void update() {
        slist.set(1, new Operation(255, "Raju", "ECE", 36000));
        System.out.println("The Updated slistay list is :");
        for (Operation var : slist) {
            System.out.println(var.empid + " " + var.name + " " + var.Salary + " " + var.dept);
        }
    }

    private static void delete() {
        slist.clear();
        System.out.println(slist);
    }

    static void read() {
        System.out.println("The Created Array List is");
        for (Operation var : slist) {
            System.out.println(var.empid + " " + var.name + " " + var.Salary + " " + var.dept);

        }
    }

}