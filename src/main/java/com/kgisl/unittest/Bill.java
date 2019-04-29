package com.kgisl.unittest;

import java.util.Scanner;

public class Bill {
	public static void main(String[] args) {

		double Amount;
		// double Charge;
		double totalAmount = 0;
		// double Total;
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter the CustomerID  ");
		int id = scan.nextInt();
		System.out.print(" Enter the Name  ");
		String name = scan.next();
		System.out.print(" Enter the Units  ");
		int Units = scan.nextInt();
		if (Units <= 199) {
			Amount = Units * 1.20;
			totalAmount = Amount;

		} else if (Units < 400) {
			Amount = Units * 1.50;
			totalAmount = Amount;
		}

		else if (Units < 600) {
			Amount = Units * 1.80;
			totalAmount = Amount;
		}
		else if (Units > 600) {
			Amount = Units * 2.00;
			totalAmount = Amount;
		}

		// if(Amount>400){
		// totalAmount=Amount*(15/100);
		// }
		double newTotal = totalAmount;
		if (newTotal > 400) {
			double charge = (newTotal * 0.15);
			double finalamount = charge + newTotal + 100;
			// double finalTotal=(newTotal*0.15)+100;
			// double finalTotal1=
			System.out.println("customer ID " + id + " Name: " + name + " Units: " + Units);
			System.out.println(
					"Normal: " + newTotal + " You should pay surcharge: " + charge + " NetAmount: " + finalamount);
		} else {
			System.out.println("customer ID " + id + " Name: " + name + " Units: " + Units);
			System.out.println("NetAmount: " + newTotal);
		}
		// System.out.println("Electricity Bill for id= " +id+" name= "+name+" Amount=
		// "+ totalAmount);
	}
}