package com.calculator;

import java.util.Scanner;

//  a number that divides the given number evenly or exactly, leaving no remainder
//  if( number % i == 0 ) --> true 
//  if (6 % 3 == 0) -->  (0 == 0) --> true ==> 3 is factor of 6
//  if (6 % 5 == 0) -->  (1 == 0) --> false ==> 5 is not-factor of 6

public class Factorss implements FactorsInteface{

	@Override
	public void getFactors() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number :");
		int one = sc.nextInt();
		System.out.print(" Factors of " + one + " are :" + one + " , ");
		
		for(int i=one /2; i>0; i--) {
			if(one % i == 0) {
				System.out.print(i);
				if(i != 1) {
					System.out.print(" , ");
				}
			}
		}
		System.out.println();
	}

}
