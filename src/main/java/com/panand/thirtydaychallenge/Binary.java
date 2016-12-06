package com.panand.thirtydaychallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		ArrayList<Integer> st = new ArrayList<Integer>();
		
		while(a > 0) {
			int r = a % 2;
			a = a/2;
			st.add(0, r);
		}
		
		int c = 0,t = 0;
		for(int i = 0; i < st.size(); i++){
			if(st.get(i) == 1) {
				t++;
			} else {
				t = 0;
			}
			
			if(t > c) {
				c = t;
			}
		}
		
		System.out.println(c);
		
		scan.close();
	}

}
