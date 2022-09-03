package com.bl.basiccoreprograms;

import java.util.Scanner;

public class SwappingNumbers {
	public static void main(String[] args) {
		
		int t; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of x and y");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Before swapping numbers: " +x+ " "+y);
		
		t = x;
		x = y;
		y = t; 
		
		System.out.println("After swapping numbers: " +x+ " "+y);
		
		System.out.println();
	}
}
