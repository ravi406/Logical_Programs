package com.logical;

import java.util.Scanner;

// Perfect Number is a positive integer that is equal to the sum of its proper divisors

// input 6,  divisors 1,2,3  output-perfect no 
// Input 10, divisors 1,2,5	 output-not perfect no

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int input = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i < input; i++) {
			if (input % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == input) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a Perfect Number");
		}
	}

}
