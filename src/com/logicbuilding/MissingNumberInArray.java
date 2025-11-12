package com.logicbuilding;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int numbers[]= {1,2,4,5,6};
		int totalNumbers=6;
		int totalSumOfAllNumbers=(totalNumbers*(totalNumbers+1))/2;
	    System.out.println(totalSumOfAllNumbers);
	    
	    //calculate sum of the given array
	    int sumOfArray=0;
	    for(int i=0;i<numbers.length;i++) {
	    	
	    	sumOfArray=sumOfArray+numbers[i];
	    	
	    	
	    }
		 
	    System.out.println(sumOfArray);
	    
	    System.out.print("The missing number is " + (totalSumOfAllNumbers-sumOfArray));
		

	}

}
