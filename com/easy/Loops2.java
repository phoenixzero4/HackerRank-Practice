/**
 * 	phoenix   Aug 24, 2024
 * 
 */

/** Integers a,b,N to create the series (a + 2**0 * b), (a + 2**0 * b + 2**1 * b), a + 2**1 * b + ... + 2**n-1 * b)
 *  print out the series of N space separated integers
 */

package com.easy;

import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		/*
		 * int t = in.nextInt();
		 * 
		 * for (int i = 0; i < t; i++) { int a = in.nextInt(); int b = in.nextInt(); int
		 * n = in.nextInt();
		 */

		int a = 5, b = 3, n = 5;

		int answer = 0;
		for (int j = 0; j < n; j++) {

			// todo figure out why my answer (after the first integer) is higher by a. Where are my order of operations off?

			answer += (a + (Math.pow(2, j)) * b);
			System.out.printf("\nAfter calculation answer is : %d ", answer - a * j);


		}
		System.out.println();
		//		}


		in.close();
	}
}

