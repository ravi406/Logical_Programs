package com.logical;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = scanner.nextInt();
		int remainder;
		int reverse = 0;

		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
			
		}
		
		System.out.println("Reversed number is :");
		System.out.println(reverse);
		scanner.close();

	}

}
