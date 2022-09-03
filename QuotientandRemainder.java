package com.bl.basiccoreprograms;

import java.util.Scanner;

import javax.naming.AuthenticationException;

public class QuotientandRemainder {
	public static void main(String[] args) {
		
//	with the given values
	
//		int dividend = 125;
//		int divisor = 4;
		
//	With the user input	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of dividend");
		
		long dividend = sc.nextLong();
		
		System.out.println("Enter the value of divisor");
		
		long divisor = sc.nextLong();
	
		long quotient = (dividend / divisor);
		long remainder = dividend % divisor;
		
		System.out.println("The quotient is: " +quotient);
		System.out.println("The remainder is: " +remainder);
	}
}

