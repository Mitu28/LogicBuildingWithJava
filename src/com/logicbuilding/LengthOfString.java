package com.logicbuilding;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create Scanner object

		System.out.print("Enter a string: ");
		String input = scanner.nextLine(); // Read full line of user input

		int size = input.length();
		System.out.println(size);
		if (size % 2 == 0) {
			System.out.println("length is even");
		} else {
			System.out.println("length is odd");
		}

	}

}
