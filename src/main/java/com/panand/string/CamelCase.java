package com.panand.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		int wordCount = 1;
		Pattern pattern = Pattern.compile("[A-Z]");
		Matcher matcher = pattern.matcher(s);
		
		while(matcher.find()) {
			wordCount++;
			//System.out.println(matcher.group());
		}
		
		scan.close();
		System.out.println(wordCount);

	}

}
