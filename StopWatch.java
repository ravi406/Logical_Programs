package com.logical;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to start the StopWatch :");
		double start = scanner.nextDouble();
		start = System.currentTimeMillis(); /* currentTimemillis() method returns the time in milliseconds and start
											  stopwatch here*/
		System.out.println("Enter 0 to stop the stopWatch :");
		double stop = scanner.nextDouble();
		stop = System.currentTimeMillis();    /* currentTimemillis() method returns the time in milliseconds and stop
											  stopwatch here*/

		double elapsedtime = (stop - start) / 1000; /* here we are calculating elapsed time */
		System.out.println("Elapsed time is:" + elapsedtime);

		scanner.close();
	}

}
