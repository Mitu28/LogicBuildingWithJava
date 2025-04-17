package com.logicbuilding;

public class PrintEvenWordsFromString {

	public static void main(String[] args) {
		String s= "Sky is blue and vast";
		String dataArray[]=s.split(" ");
		
		for(String word: dataArray) {
			//System.out.println(word);
			if(word.length()%2==0) {
				System.out.println(word);
			}
		}

	}

}
