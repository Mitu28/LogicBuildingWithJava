package com.logicbuilding;

//Reverse Integer 123
//Logic 

public class ReverseIntegerSol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=-789;
		int reverseNumber=0;
		int lastdigit;
		
		lastdigit=number%10;// i.e=3;2nd time=2;1
		reverseNumber=reverseNumber*10+lastdigit;//=3;32;321
		number=number/10;//=12;1;0
		
		while(number!=0) {
			
			lastdigit=number%10;//niche bacha hua
			reverseNumber=reverseNumber*10+lastdigit;
			number=number/10;//upar bacha hua
			
		}
		System.out.println(reverseNumber);
			
	}

}
