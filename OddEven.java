package com.bl.basiccoreprograms;

import java.util.Scanner;

	public class OddEven {
		static void EvenOdd(){

		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if ( num % 2 == 0){
			System.out.println("The given number is even");
		}
		else {
			System.out.println("The given number is not even");
		}
	}
		public static void main(String[] args) {
			EvenOdd();
	}
}

