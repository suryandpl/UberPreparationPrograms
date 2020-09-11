package ds_problems;

import java.util.Scanner;

public class CountDigitsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How man strings u want to check?");
		// Take the input of no. of test cases
		int t = sc.nextInt();
		// looping until the test cases are zero
		while (t-- > 0) {
			// Input the string
			System.out.println("Enter the string!");
			String s = sc.next();
			// counter to count the number of digits in a string
			int digits = 0;
			// looping until the string length is zero
			for (int i = 0; i < s.length(); i++) {
				// isDigit is a function of Character class it checks a particular char that
				// whether it is a digit or not
				if (Character.isDigit(s.charAt(i))) {
					// counter digit will be incremented each time when a character will be a digit
					digits++;
				}
			}
			// prints the number of digits in a string
			System.out.println(digits);
		}
		System.out.println();
		sc.close();
	}
}
