package com.ust5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Enumeration_Regex_Matcher_Pattern_1 {
	private static final String REGEX="\\bcat\\b";
	private static final String INPUT="cat cat cat cattie cat";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern p=Pattern.compile(REGEX);
		Matcher m=p.matcher(INPUT);   //get a matcher object
		int count=0;
		while(m.find()) {
			count++;
			System.out.println("Match numer"+count);
			System.out.println("start():"+m.start());
			System.out.println("end():"+m.end());
		}
	}

}