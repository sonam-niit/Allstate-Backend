package com.allstate.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {

	public static void main(String[] args) {
		
		String regex="[a-zA-Z]+";
		String userInput="Welcome to the World of REGEX";
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher matcher= pattern.matcher(userInput);
		
		while(matcher.find())
		{
			System.out.println(userInput.substring(matcher.start(),matcher.end()));
		}
	}
}
