package com.panand.thirtydaychallenge;

import java.util.Scanner;

public class OperatorMeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        
        double tipCost = mealCost * (tipPercent/100f);
        double taxCost = mealCost * (taxPercent/100f);
        
        int totalCost = (int) Math.round(mealCost + tipCost + taxCost);
        
        System.out.println("The total meal cost is " + totalCost + " dollars");

	}

}
