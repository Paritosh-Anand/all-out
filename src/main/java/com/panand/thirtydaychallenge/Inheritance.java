package com.panand.thirtydaychallenge;

import java.util.Scanner;

class PersonA {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	PersonA(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends PersonA{
	
	private int[] testScores;
	private int sum = 0;
	private int average = 0;
	
	public Student(String firstName, String lastName, int id, int[] testScores) {
		super(firstName, lastName, id);
		this.testScores = testScores;
	}

	public String getGrade(int a) {
		
		if(90 <= a && a <= 100) {
			return "O";
		} else if (80 <= a && a <= 90) {
			return "E";
		} else if (70 <= a && a <= 80) {
			return "A";
		} else if (55 <= a && a <= 70) {
			return "P";
		} else if (40 <= a && a <= 55) {
			return "D";
		} else if (a < 40) {
			return "T";
		} else {
			return "T";
		}
	}
	
	public String calculate() {
		for(int i = 0; i < testScores.length; i++) {
			sum += testScores[i];
		}
		average = sum / testScores.length;
		return getGrade(average);
	}
   
}

public class Inheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );

	}

}
