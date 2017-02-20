package com.panand.thirtydaychallenge;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
        	System.out.println(Integer.valueOf(S));
        } catch (NumberFormatException ne) {
        	System.out.println("Bad String");
        }
        
        in.close();

	}

}
