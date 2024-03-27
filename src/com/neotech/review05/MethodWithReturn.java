package com.neotech.review05;

public class MethodWithReturn {

	public static void main(String[] args) {

		String name = "Rigena";
		int numOfChars = name.length();

		System.out.println("The length of the string is " + numOfChars);

		MethodWithReturn m = new MethodWithReturn();
		boolean res = m.isOdd(17);
		System.out.println("Is 17 odd? " + res);

		boolean res2 = m.isOddEnhanced(6);
		System.out.println("Is 6 odd? " + res2);

	}

	// If this one is confusing, don't worry :)
	boolean isOddEnhanced(int num) {
		return num % 2 == 1;
	}

	boolean isOdd(int num) {
		boolean result;

		if (num % 2 == 1) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}