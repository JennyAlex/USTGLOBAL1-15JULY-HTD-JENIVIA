package com.dev.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcept {

	public static void main(String[] args) {
	
		
	Pattern pat= Pattern.compile("\\d");  //digits betwn 0 to 9
	Matcher mat= pat.matcher("7");
	System.out.println("For \\d:" +mat.matches());
	
	pat= Pattern.compile("\\d+");  //multiple digit
	 mat= pat.matcher("745678");
	System.out.println("For \\d+:" +mat.matches());
	
	pat= Pattern.compile("\\D");  //represents anything but no.
	 mat= pat.matcher("$");
	System.out.println("For \\d+:" +mat.matches());
	
	pat= Pattern.compile("\\d{3}");  //three digits
	 mat= pat.matcher("745");
	System.out.println("For \\d+:" +mat.matches());
	
	
	pat= Pattern.compile("\\D+");  
	 mat= pat.matcher("@hdsjhdkjf");
	System.out.println("For \\D+:" +mat.matches());
	
	pat= Pattern.compile("\\s");  //single space
	 mat= pat.matcher(" ");
	System.out.println("For \\s:" +mat.matches());
	
	pat= Pattern.compile("\\s+");  //multiple space
	 mat= pat.matcher("   ");
	System.out.println("For \\s+:" +mat.matches());
	
	pat= Pattern.compile("\\S");  //no space allowed rest everything allowed
	 mat= pat.matcher("g");
	System.out.println("For \\S:" +mat.matches());
	
	pat= Pattern.compile("\\S+");  // no multiple spaces allowed
	 mat= pat.matcher("hj");
	System.out.println("For \\S+:" +mat.matches());
	
	pat= Pattern.compile("\\w");  //single char
	 mat= pat.matcher("q");
	System.out.println("For \\w:" +mat.matches());
	
	pat= Pattern.compile("\\w+");  //multiple char
	 mat= pat.matcher("qwertyu");
	System.out.println("For \\w+:" +mat.matches());

	pat= Pattern.compile("\\W");  //special char
	 mat= pat.matcher("!");
	System.out.println("For \\W:" +mat.matches());
	
	pat= Pattern.compile("\\W+");  //multiple special char
	 mat= pat.matcher("!@#$%^&*");
	System.out.println("For \\W+:" +mat.matches());
	
	
	}

}
