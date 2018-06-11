package com.assignment.two;

import java.util.Scanner;

public class Palindrome {
	
	// able was I ere I saw Elba
	
	static String reversedString, checkOther;
	static int left, right;

	public Palindrome() {
		// TODO Auto-generated constructor stub
		checkOther = "y";
	}
	
	public static void verifyPalindrome() {
		Boolean repeat = true;
		while(repeat) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a Sentence to verify as Palindrome: ");
			String sentence = scanner.nextLine();
			String parsedSentence = sentence.toLowerCase().replaceAll("\\s", "");
			left = 0;
			right = parsedSentence.length()-1;
			while(left < (parsedSentence.length()/2)) {
				if(parsedSentence.charAt(left++) != parsedSentence.charAt(right--)) {
					System.out.println("This string is a Palindrome");
					break;
				}
			}
			System.out.println("Do you want to check another ?('y'/'n')");
			checkOther = scanner.nextLine();
			if(!checkOther.equalsIgnoreCase("y")) {
				repeat = false;
				System.exit(0);
			}
			scanner.close();
		}
	}
	
}
