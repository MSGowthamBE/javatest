package com.kgisl.unittest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Data {

    public static void main(String[] args) {
        List<Employee> details = Arrays.asList(new Employee(122, "Gowtham", "Sales", 36000.90f),
                new Employee(693, "Ramu", "Marketing", 58222.35f), new Employee(362, "Raju", "Production", 28000.50f));
        details.forEach(System.out::println);
        System.out.println("\nTotal Salary of all the Employee");

        double d1 = details.stream().mapToDouble(Employee::getSalary).sum();

        System.out.println(d1);
        System.out.println("\nTotal Salary of sales-Dept");

        Predicate<Employee> sal = x -> x.getDept() == "Sales";
        List<Employee> l1 = details.stream().filter(sal).collect(Collectors.toList());
        double d3 = details.stream().mapToDouble(Employee::getSalary).sum();

        System.out.println(d3);

        details.stream().max(Comparator.comparing(Employee::getSalary))

                .ifPresent(p -> System.out.println("Department HighPay:" + p));

        details.stream().min(Comparator.comparing(Employee::getSalary))

                .ifPresent(p -> System.out.println("Department with lowest pay:" + p));

        details.stream().collect(Collectors.groupingBy(Employee::getSalary)).values().stream()
        
                .filter(m -> m.size() > 1)

                .forEach(m -> System.out.println("Employee with same salary:" + m));

    }}