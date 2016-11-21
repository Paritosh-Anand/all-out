package com.panand.array;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
                
        scan.useDelimiter("\n");
        String readArr = scan.next();
        String[] arr = readArr.split(" ");

        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	sum += Integer.valueOf(arr[i]);
        }
        
        System.out.println(sum);
        scan.close();
	}
	
}
