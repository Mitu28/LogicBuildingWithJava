package com.logicbuilding;

import java.util.Scanner;

public class NumberEvenOddCheck {

	public static void main(String[] args) {
		// int number=33;
		Scanner scanner = new Scanner(System.in); // Create Scanner object

		System.out.print("Enter a number: ");
		int number = scanner.nextInt(); // Read user input

		//if (number % 2 == 0) {
		if ((number & 1) == 0) {
			System.out.println("Number is even");
		}

		else {
			System.out.println("Number is odd");

		}

	}

}
