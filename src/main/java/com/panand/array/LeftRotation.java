package com.panand.array;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		scan.useDelimiter("\n");
		
        String readConf = scan.next();
        String[] conf = readConf.split(" ");
        
        int len = Integer.parseInt(conf[0]);
        int num_rotate = Integer.parseInt(conf[1]);
        
        String readArr = scan.next();
        String[] arr = readArr.split(" ");
        
        int offset = len - num_rotate % len;
        
        if(offset > 0) {
        	String[] arrCopy = arr.clone();
        	for(int i = 0; i < arr.length; ++i) {
        		int j = (i + offset) % arr.length;
        		arr[j] = arrCopy[i];
        	}
        }
        
        for(int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }
        
        scan.close();
	}

}
