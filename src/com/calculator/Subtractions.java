package com.calculator;

import java.util.Scanner;

public class Subtractions implements SubtractionInterface{

	@Override
	public void getSubtraction() {
		Scanner sc = new Scanner(System.in);
		int one;
		int two ;
		System.out.println("You are performing Subtraction of two numbers :\n");
		while(true) {
			try {
				System.out.println("Enter First Number :");
				one = sc.nextInt();
				break;
			}
			catch(RuntimeException e) {
				System.out.println("Expecting int type data ");
				sc.next();
			}
		}
		while(true) {
			try {
				System.out.println("Enter Second Number :");
				two = sc.nextInt();
				break;
			}
			catch(RuntimeException e) {
				System.out.println("Expecting int type data ");
				sc.next();
			}
		}
		int subtraction = one - two;
		System.out.println("Subtraction is "+ subtraction);
		
	}

}
