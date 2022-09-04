package com.bl.basiccoreprograms;

import java.util.Scanner;

public class Harmonic {

	public static void main(String... a) {
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("The Harmonic series is: ");
		
		double result = 0;
		while(num > 0) {
			result = result + (double) 1/num;
			num--;
			System.out.println(result + " ");
		}
//		System.out.println("\n");
		System.out.println("Outpur of Harmonic series is: " +result);
		}
	}

