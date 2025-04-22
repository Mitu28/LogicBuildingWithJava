package com.logicbuilding;

public class PatternPrintingNumericHollow {
	public static void main(String[] args) {
		
		int totalNumberOfLines=5;
		for(int i=1;i<=totalNumberOfLines;i++) {
			//System.out.println(row);
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i ||i==totalNumberOfLines) {
				System.out.print(j);
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}

		
		
	}

}
