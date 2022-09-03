package com.bl.basiccoreprograms;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the year");
	
	long year = sc.nextLong();
	
	if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
		System.out.println("The year is leap year");
	}
	else {
		System.out.println("The year is not leap year");
	}
}
}
