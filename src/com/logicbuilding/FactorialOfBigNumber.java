package com.logicbuilding;

import java.math.BigInteger;

public class FactorialOfBigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=50;
	    
		BigInteger result=BigInteger.ONE;
	    
	    for(int i=1;i<=n;i++) {
		 
		 result=result.multiply(BigInteger.valueOf(i));
		 
		 }
			
      System.out.println(result);
	}

}
