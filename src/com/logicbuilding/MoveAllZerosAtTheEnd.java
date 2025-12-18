package com.logicbuilding;

public class MoveAllZerosAtTheEnd {

	public static void main(String[] args) {
		
		int a[]= {1,0,2,0,0,4,5};
		int currentValue=0;
		int putNonZeroValue=0;
		
		for(int current =0;current<=a.length-1;current++) {
			
			
			if(a[current]!=0) {
				
				int temp = a[putNonZeroValue];
				a[putNonZeroValue]=a[current];
				a[current]=temp;
				putNonZeroValue++;
				
		
	
		}
			
			
	}
		
		
		for(int no:a) {
			
			System.out.print(no+ " ");
			
			
		}
		
		
		

	}

}
