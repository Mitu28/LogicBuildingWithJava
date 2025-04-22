package com.logicbuilding;

public class PatternPrinting {

	public static void main(String[] args) {
	int totalNumberOfLines=5;
	for(int row=1;row<=totalNumberOfLines;row++) {
		//System.out.println(row);
		for(int col=1;col<=row;col++) {
			System.out.print((char)('a' + col-1));
			
		}
		System.out.println(" ");
	}

	}

}
