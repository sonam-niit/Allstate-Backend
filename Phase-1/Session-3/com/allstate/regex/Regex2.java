package com.allstate.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
		
		String regex="[987]{3}[0-9]{7}";
		String userInput="8974949383";
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher matcher= pattern.matcher(userInput);
		
		if(matcher.matches())
			System.out.println("pattern matched");
		else
			System.out.println("Not matched");
		
	}
}
