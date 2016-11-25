package com.panand.string;

import java.util.Scanner;

public class DayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		double q = scan.nextDouble();
		scan.useDelimiter("\n");
		String r = scan.next();
		
		System.out.println(i + p);
		System.out.println(d + q);
		System.out.println(s.concat(r));
		
		scan.close();

	}

}
