package com.bl.basiccoreprograms;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N = sc.nextInt();

		for (int i = 2; i * i <= N; i++) {
			if (N % 2 == 0) {

				System.out.println(2);
				while (N % 2 == 0) {
					N = N / 2;
				}
			}
			if (N % i == 0)
				System.out.println(i + " ");
		}
	}
}
