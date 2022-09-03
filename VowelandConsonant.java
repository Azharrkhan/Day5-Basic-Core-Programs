package com.bl.basiccoreprograms;

import java.util.Scanner;

public class VowelandConsonant {

	public static void main(String[] args) {
		
		System.out.println("Enter an alphabet");
		
		Scanner sc = new Scanner(System.in);
		 char ch = sc.next().charAt(0);
		
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
		 System.out.println(ch + " is a vowel");	
	}
	else {
		System.out.println(ch + " is a consonant");
	}
}
}
