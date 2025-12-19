package com.logicbuilding;

public class StringLengthWithoutLengthMethod {
	
	
	public static void main(String[] args) {
		
		String data="hello";
		System.out.println(data.length());
		
		char characters[]=data.toCharArray();
		int count=0;
		
		
		for(char x: characters) {
			
			count++;
			
			
		}
		
		System.out.print(count);
		
		
		
		
		
		
	}

}
