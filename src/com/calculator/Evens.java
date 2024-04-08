package com.calculator;

import java.util.Scanner;

public class Evens implements EvenInterface{

	@Override
	public void getEven() {
		Scanner sc = new Scanner(System.in);
		int one;
		System.out.println("You are performing Even or Odd number :");
		while(true) {
			try {
				System.out.println("Enter Number :");
				one = sc.nextInt();
				break;
			}
			catch(RuntimeException e) {
				System.out.println("Expecting int type data ");
				sc.next();
			}
		}
		
		if(one % 2 == 0) {
			System.out.println(one + " is the Even number");
		}
		else {
			System.out.println(one + " is the Odd number");
		}
		
	}
	
	

}
