package com.logicbuilding;

import java.util.HashSet;

public class PangramWithCollections {

	public static void main(String[] args) {
		
		String input="the quick brown fox jumps over a lazy ";
	
		System.out.println(input);
	boolean result=	checkPanagram(input);
		
		
}

	private static boolean checkPanagram(String input) {
		HashSet<Character> characterSet=new HashSet<Character>();
		
		char inputChar[]=input.toLowerCase().toCharArray();
		for(char c : inputChar) {
			if(Character.isLetter(c)) {
				characterSet.add(c);
			}
		}
		if(characterSet.size()==26) {
			System.out.println("It's Panagram");
			return true;
		}
		System.out.println("It's not a Panagram");
		return false;
	}
	
	
}
