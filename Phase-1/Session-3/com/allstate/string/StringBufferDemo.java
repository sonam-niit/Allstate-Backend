package com.allstate.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringBufferDemo {

	public static void main(String[] args) {

		String s1 = new String("Hello World");// immutable

		// make it mutable
		StringBuffer sb = new StringBuffer(s1);

		sb.append(" Test");
		System.out.println(sb);
		sb.replace(12, 16, "Good Morning");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

		// make it mutable
		StringBuilder sb1 = new StringBuilder(s1);

		sb1.append(" Test");
		System.out.println(sb1);
		sb1.replace(12, 16, "Good Morning");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
	}
}
