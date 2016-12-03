package com.panand.thirtydaychallenge;

import java.util.Scanner;

public class Recursion {
	
	public static int factorial(int f) {
		int start = 1;
		for(int i = 1; i <= f; i++) {
			start = start * i;
		}
		return start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int f = scan.nextInt();
		System.out.println(factorial(f));

		scan.close();
	}

}
