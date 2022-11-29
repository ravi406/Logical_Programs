package com.logical;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
	
	public static boolean isPresent(int number[], int randomNum) {
		for (int i = 0; i < number.length; i++) {
			if (number[i] == randomNum) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a total number of coupons :");
		int couponSize = scanner.nextInt();		
		int randomNum = 0;
		
		int number[] = new int[couponSize];
		Random coupon = new Random();
		boolean check;
		
		for (int i = 0; i < number.length; i++) {
			randomNum = coupon.nextInt(20)+1;
			check = isPresent(number, randomNum);
			if (check != true) {
				number[i] = randomNum;
			} 
			else 
			{
				--i;
			}
		}	
		System.out.println("The Coupon numbers generated are ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(" " + number[i]);
		}
		scanner.close();
	}
}
