package com.neotech.review05;

public class TestBora {

	public static void main(String[] args) {
		Bora b = new Bora();

		b.addTwoNumbers();
		b.addTwoNumbersThatIGive(5, 6);

		int res1 = b.addTwoNumbersAndGiveMeTheResult();

		int res2 = b.addTwoNumbersThatIGiveAndGiveMeTheResult(4, 9);

		if (res2 == 13) {
			System.out.println("Gob job Bora!");
		} else {
			System.out.println("I still love you :)");
		}
	}

}