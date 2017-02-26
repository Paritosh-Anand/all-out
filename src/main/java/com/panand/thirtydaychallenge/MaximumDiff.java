package com.panand.thirtydaychallenge;

import java.util.Arrays;
import java.util.Scanner;

class Difference {
	
	private int[] elements;
	public int maximumDifference;
	
	public Difference(int[] a) {
		this.elements = a;
	}

	public void computeDifference() {
		Arrays.sort(elements);
		int lastIndex = elements.length - 1;
		this.maximumDifference = elements[lastIndex] - elements[0];
	}
	
	public int maximumDifference() {
		return maximumDifference;
	}
}

public class MaximumDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);

	}

}
