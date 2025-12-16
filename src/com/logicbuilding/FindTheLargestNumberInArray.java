package com.logicbuilding;

public class FindTheLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {10,20,30,40,50,60};
		
		int largest= numbers[0];
	
		
		for(int index=1;index<=numbers.length-1;index++) {
			
			if(numbers[index]>largest) {
				largest=numbers[index];
				
			}
			
			
		}
		
		System.out.println("The Largest Number is " +largest);
		
		

	}

}
