package com.logicbuilding;

public class CheckIfTheNumberIsArmStrongOrNot {

	public static void main(String[] args) {
	
		int number=153;
		int copyNumber=number;
		int lastDigit;
		int armStrong=0;
		
		while(copyNumber!=0) {
			
			lastDigit=copyNumber%10;
			armStrong=armStrong+(lastDigit*lastDigit*lastDigit);
			copyNumber=copyNumber/10;
			
	}
		
		if(number==armStrong) {
			System.out.print("It is an armstrong Number");
			
		}else {
			System.out.print("It is not an armstrong Number");
		}
		

	}

}
