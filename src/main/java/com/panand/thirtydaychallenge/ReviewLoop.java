package com.panand.thirtydaychallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class ReviewLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int numTestCases = scan.nextInt();
		ArrayList<String> s = new ArrayList<String>();
		for(int i = 0; i < numTestCases; i++) {
			s.add(scan.next());
		}
		
		
		for(int i = 0; i < s.size(); i++) {
			 String odd = "", even = "";
			 for(int m = 0; m < s.get(i).length(); m++) {
				 if(m % 2 == 0) {
					 even += s.get(i).charAt(m);
				 } else {
					 odd += s.get(i).charAt(m);
				 }
			 }
			 System.out.println(even + " " + odd);
		}
		
		scan.close();

	}

}
