package com.kgisl.unittest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Employees
 */
public class Employee2 {
    public static void main(String[] args) {
        List<Employees> details = Arrays.asList(new Employees(22206, "Raju", 12000),
                new Employees(12446, "Sonu", 78200), new Employees(225500, "Ramu", 79000), new Employees(222069, "Vishnu", 63000));
        // details.forEach(System.out::println);
        // System.out.println("Sorted:");

        // List<Employees> fromId =
        // details.stream().sorted(Comparator.comparing(Employees::getEmpid))
        // .collect(Collectors.toList());
        // fromId.forEach(System.out::println);

        // List<Employees> nam =
        // details.stream().sorted(Comparator.comparing(Employees::getName))
        // .collect(Collectors.toList());
        // nam.forEach(System.out::println);

        // List<String> d = details.stream().map(y -> (y.getEmpid() + y.getName() + y.getSalary()) + "------------->" + "ID: " + y.getEmpid()+"  "
        //                 + "\tName:  " + y.getName() + "\tSalary: " + y.getSalary())
        //         .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        // System.out.println(d);

        // List<String> s=d.stream().sorted(Comparator.comparing(Employees::getEmpid)).forEach(System.out::println);
        // System.out.println("ID");
        System.out.println("ID");    
        List<Employees> fromId=details.stream().sorted(Comparator.comparing(Employees::getEmpid)).collect(Collectors.toList());
        Collections.reverse(fromId);
        fromId.forEach(System.out::println);
        
        System.out.println("Name");
        List<Employees> fromName=details.stream().sorted(Comparator.comparing(Employees::getName)).collect(Collectors.toList());
        // Collections.sort(fromName, Collections.reverseOrder());
        Collections.reverse(fromName);
        fromName.forEach(System.out::println);

        System.out.println("Salary");
        List<Employees> fromSalar=details.stream().sorted(Comparator.comparing(Employees::getSalary)).collect(Collectors.toList());
        Collections.reverse(fromSalar);
        fromSalar.forEach(System.out::println);
    }
}