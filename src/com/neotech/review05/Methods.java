package com.neotech.review05;

public class Methods {

	void sayWelcome() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void sayWelcomeWithNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void sayGreeting(String greeting) {
		for (int i = 1; i <= 5; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Methods m = new Methods();
		m.sayWelcome();
		m.sayWelcomeWithNumber(2);
		m.sayWelcomeWithNumber(4);
		
		m.sayGreeting("Merhaba");
		m.sayGreeting("Hola");

	}

}