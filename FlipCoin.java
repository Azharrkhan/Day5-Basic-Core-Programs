package com.bl.basiccoreprograms;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
//		System.out.println("Coin is flipped");
//		Random rn = new Random(1);
		String head;
		String tail;
//		int noOfFlips = rn.nextInt(2);
//		
//		System.out.println("Enter the no Of times coin flip: " +noOfFlips);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of flips");
		int noOfFlips = sc.nextInt();
		
		float percentage;
		float tailCount = 0;
		float headCount = 0;
		for (int i = 1; i <= noOfFlips; i++) {
			if ( Math.random() < 0.5){
				System.out.print(" T ");
				tailCount++;
			}
			else {
				System.out.print(" H ");
				headCount++;
				}
		}
		System.out.println();
		System.out.println("no of Tail: " + tailCount + " " + "percentage of tail: " + (tailCount/noOfFlips)*100);
		System.out.println("no of Head: " + headCount + " " + "percentage of head: " + (headCount/noOfFlips)*100);
	}
}
