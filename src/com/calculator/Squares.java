package com.calculator;

import java.util.Scanner;

public class Squares implements SquareInterface{

	@Override
	public void getSquare() {
		Scanner sc = new Scanner(System.in);
		int number ;
		System.out.println("You are performing Square of a number :");
		while(true) {
			try {
				System.out.println("Enter Number :");
				number = sc.nextInt();
				break;
			}
			catch(RuntimeException e) {
				System.out.println("Expecting int type data ");
				sc.next();
			}
		}
		int square = number * number;
		System.out.println("Square of "+ number +" is "+ square);
		
	}

}
