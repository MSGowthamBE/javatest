package com.kgisl.unittest;

import java.util.Scanner;

/**
 * Game
 */
public class GameProgram{

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scan.nextInt();
        if (a % 2 == 0) {
            System.out.println(a * 2 + " " + ((a * 2) + 1) + " " + ((a * 2) + 2));
        } else if (a % 2 != 0) {

            System.out.println(a * 2 + " " + ((a * 2) + 1) + " " + ((a * 2) + 2));
        }

        System.out.println("Enter b:");
        int b = scan.nextInt();

        if (b % 2 == 0) {
            System.out.println(b / 2 + " " + ((b / 2) / 2) + " " + ((b / 2) / 2 / 2));
        } else if (b % 2 != 0) {

            System.out.println(b / 2 + " " + ((b / 2) / 2) + " " + ((b / 2) / 2 / 2));
        }
    }

}