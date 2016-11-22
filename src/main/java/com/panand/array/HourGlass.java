package com.panand.array;

import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String hourGlass = null;
		int matrixOrder = 6;
		
		int[][] arr = new int[matrixOrder][matrixOrder];
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr.length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		scan.close();

		Integer maxSum = Integer.MIN_VALUE;
		for(int i=0; i < 4; i++) {
			for(int j=0; j < 4; j++) {
				int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
									+ arr[i+1][j+1]
						+ arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				if(maxSum < sum) {
					hourGlass = "";					
					maxSum=sum;

					hourGlass = arr[i][j] + " " + arr[i][j+1] + " " + arr[i][j+2] + "\n" + arr[i+1][j+1] + "\n" 
							+ arr[i+2][j] + " " + arr[i+2][j+1] + " " + arr[i+2][j+2];
				}
			}
		}
		
		System.out.println("max sum is - " + maxSum);
		System.out.println(hourGlass);
	}

}
