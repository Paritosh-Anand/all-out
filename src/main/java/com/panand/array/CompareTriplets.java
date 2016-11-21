package com.panand.array;

import java.util.Scanner;

public class CompareTriplets {

	public static void main(String[] args) {

		int size = 3, aliceScore = 0, bobScore = 0;
		
		Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        
        String[] aliceTriplet = scan.next().split(" ");
        String[] bobTriplet = scan.next().split(" ");

        scan.close();

        for(int i = 0; i < size; i++) {
        	if(Integer.valueOf(aliceTriplet[i]) > Integer.valueOf(bobTriplet[i])) {
        		aliceScore++;
        	} else if(Integer.valueOf(aliceTriplet[i]) < Integer.valueOf(bobTriplet[i])) {
        		bobScore++;
        	}
        }
        
        System.out.println(aliceScore + " " + bobScore);
        
	}

}
