package com.logicbuilding;

public class Pangram {

	public static void main(String[] args) {
		
		String input="The quick brown fox jumps over a lazy dog";
		input=input.toLowerCase();
		System.out.println(input);
	boolean result=	checkPanagram(input);
	if(result) {
		System.out.println("panagram");
		
	}else {
		System.out.println("not panagram");
	}
		
		
		
	}

	private static boolean checkPanagram(String input) {
		if(input.length()<26) {
			return false;
		}
		for(char i='a';i<='z';i++) {
			if (input.indexOf(i)<0) {
				return false;
			}
			//System.out.println(i);
		
		}
		return true;
	}
	
	
}
