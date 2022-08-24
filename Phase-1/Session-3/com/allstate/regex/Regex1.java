package com.allstate.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

	public static void main(String[] args) {
		
		String regex="[a-zA-Z0-9]*";
		String userInput="SonamSoni01";
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher matcher= pattern.matcher(userInput);
		
		if(matcher.matches())
			System.out.println("pattern matched");
		else
			System.out.println("Not matched");
		
	}
}
