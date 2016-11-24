package com.panand.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		
		String rev = "";
		
		for(int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		
		if(a.equalsIgnoreCase(rev)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		scan.close();
	}

}
