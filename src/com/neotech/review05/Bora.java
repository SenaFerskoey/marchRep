package com.neotech.review05;

public class Bora {

	// NO parameters and NO return type
	void addTwoNumbers() {
		int result = 3 + 2;
	}

	// TWO parameters and NO return type
	void addTwoNumbersThatIGive(int a, int b) {
		int result = a + b;
	}

	// NO parameters and WITH return type
	int addTwoNumbersAndGiveMeTheResult() {
		int result = 3 + 2;
		return result;
	}
	
	// TWO parameters and WITH return type
	int addTwoNumbersThatIGiveAndGiveMeTheResult(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

}