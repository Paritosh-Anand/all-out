package com.panand.java;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n % 2 == 1) { // n is odd -- weird
			System.out.println("Weird");
		} else {
			if(n > 1 && n < 6 ){
				System.out.println("Not Weird");
			} else if(n > 5 && n < 21) {
				System.out.println("Weird");
			} else if(n > 20) {
				System.out.println("Not Weird");
			}
		}
		
		scan.close();

	}

}
