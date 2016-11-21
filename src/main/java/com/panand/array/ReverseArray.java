package com.panand.array;

import java.util.Scanner;

/**
 * @author paritoshanand
 *
 */
public class ReverseArray 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        
        int s = 0;
        int e = size - 1;
        String temp;

        scan.useDelimiter("\n");
        String readArr = scan.next();
        String[] arr = readArr.split(" ");
        
        while(s < e) {
        	temp = arr[s];
        	arr[s] = arr[e];
        	arr[e] = temp;
        	s++; e--;
        }
        
        for(int i = 0; i < size; i++) {
        	System.out.print(arr[i] + " ");
        }
        
        scan.close();
    }
}
