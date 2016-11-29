package com.panand.thirtydaychallenge;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 1; i <= 10; i++) {
        	System.out.println(n + " x " + i + " = " + n * i);
        }
	}

}
