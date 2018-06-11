package com.assignment.two;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("If you want the Palindrome press 'p' key, "
				+ "for difference b/w Min and Max press 'm'"
				+ "for lang.Math Demo press 'lm'");
		String argument = scanner.nextLine();
		if(argument.equalsIgnoreCase("p")){
			Palindrome.verifyPalindrome();
		} else if(argument.equalsIgnoreCase("m")) {
			MathArray diff = new MathArray();
			diff.diffMaxMin();
		} else {
			System.out.println("Math.demo implementation is too boring., try another., Bye.,");
		}
		scanner.close();
	}
}

