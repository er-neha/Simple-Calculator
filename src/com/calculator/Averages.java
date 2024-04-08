package com.calculator;

import java.util.Scanner;

public class Averages implements AverageInterface{

	@Override
	public void getaverage() {
		Scanner sc = new Scanner(System.in);
		int count;
		while(true) {
			try {
				System.out.println("How many number's average you want to count :");
				count = sc.nextInt();
				break;
			}
			catch(RuntimeException e) {
				System.out.println("Expecting int type data ");
				sc.next();
			}
		}
		
		int [] number = new int[count];
		int sum =0;
		
		for(int i=0; i<count; i++) {
			while(true) {
				try {
					System.out.println("Enter number "+ (i+1));
					number[i] = sc.nextInt();
					sum = sum + number[i];
					break;
				}catch(RuntimeException e) {
					System.out.println("Expecting int type data");
					sc.next();
				}
			}
		}
		
		 
		System.out.println("[ ");
		for(int i=0; i<count; i++) {
			System.out.print(number[i] +" ");
		}
		System.out.println(" ]");
		System.out.println("Sum of these " +count + " numbers is :"+ sum);
		int average = sum / count;
		System.out.println("Averrage of these " +count + " numbers is :"+ average);	
	}
}
