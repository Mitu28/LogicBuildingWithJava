package com.logicbuilding;

public class LinearSearchingInArray {

	public static void main(String[] args) {
	int inputArray[]= {1,23,45,33,22,24,55,66};
	int key=5;
	boolean isPresent=false;
	
	for(int number: inputArray) {
		
		
		if (number==key){
			isPresent=true;
			break;
		}
	}
	if(isPresent) {
		System.out.println("Value Found in the Array");
	}else {
		System.out.println("Value not Found in the Array");
	}

	}

}
