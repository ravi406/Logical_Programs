package com.logical;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check Prime Or Not :");
		int number = scanner.nextInt();
		int count = 0;
		for (int i = 2; i < number - 1; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		if (count > 0) {
			System.out.println("not a prime Number");
		} else {
			System.out.println("Prime number");
		}
		scanner.close();
	}

}
