package com.logicbuilding;

public class CheckIfNumberIsPalindromeOrNotUsingStringBuilder {

	public static void main(String[] args) {
		
		
		int number=121;
		String originalNumberInString=Integer.toString(number);
		String  originalNumberInString2=number+  " ";
		StringBuilder reverseStringBuilder=new StringBuilder(originalNumberInString);
		String reverseString=reverseStringBuilder.reverse().toString();
		
		if(originalNumberInString.equals(reverseString)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
			
		}
	}
	
	

}
