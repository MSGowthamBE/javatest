package com.kgisl.unittest;

import java.util.Scanner;

public class FLname {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Enter your first name and last name");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        int space = input.indexOf(' ');
        String firstName = input.substring(0, space);
        String lastName = input.substring(space + 1);

        System.out.println(firstName+ "  The length is:"+ firstName.length());
        System.out.println(lastName + "  The length is:"+lastName.length());
    }

}
