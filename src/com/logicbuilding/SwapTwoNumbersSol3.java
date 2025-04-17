package com.logicbuilding;

public class SwapTwoNumbersSol3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=10;//binary value 01010
		int b=20;//binary value 10100
		System.out.print("a= "+a);
		System.out.print("b= "+b);
		a=a^b;//a=11110
		b=a^b;//b=01010
		a=a^b;//a=10100
		System.out.print("a final = "+a);
		System.out.print("b final = "+b);
	}

}
