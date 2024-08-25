/**
 * 	phoenix   Aug 24, 2024
 * 
 *  given a string followed by an integer, output the string left justified 15 spaces and the integer to 3 places (pad with zeroes if less than 3 digits long.
 * 
 */

package com.easy;

import java.util.Scanner;

public class StringFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			System.out.printf("%-14s %03d\n", s1, x);
		}
		System.out.println("================================");
		sc.close();
	}
}
