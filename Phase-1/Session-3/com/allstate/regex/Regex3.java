package com.allstate.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {

	public static void main(String[] args) {
		
		String regex="^a[a-z]*";
		String userInput="sonamsoni";
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher matcher= pattern.matcher(userInput);
		
		if(matcher.matches())
			System.out.println("pattern matched");
		else
			System.out.println("Not matched");
		
	}
}
