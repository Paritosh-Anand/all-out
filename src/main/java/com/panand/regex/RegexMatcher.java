package com.panand.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pattern pattern = Pattern.compile("^[^\\n]{3}\\.[^\\n]{3}\\.[^\\n]{3}\\.[^\\n]{3}$", Pattern.CASE_INSENSITIVE);
		//String testString = "a#c.def.ghi.jkx";
		
		// Matching digit and non-digit
		//Pattern pattern = Pattern.compile("^[\\d]{2}[\\D]{1}[\\d]{2}[\\D]{1}[\\d]{4}$", Pattern.CASE_INSENSITIVE);
		
		// Matching Specific Characters
		Pattern pattern = Pattern.compile("^[1-3]{1}[0-2]{1}[xs0]{1}[30Aa]{1}[xsu]{1}[\\.,]{1}$", Pattern.CASE_INSENSITIVE);
		String testString = "12s0u.";
		
		Matcher matcher = pattern.matcher(testString);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
	}

}
