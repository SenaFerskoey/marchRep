package com.neotech.review05;

public class World {

	public static void main(String[] args) {

		// Declaring and initializing a variable
		Baby baby1 = new Baby();
		baby1.name = "Buket";
		baby1.weight = 4;

		System.out.println("The name of baby1 is -> " + baby1.name);
		System.out.println("The hair color of baby1 is -> " + baby1.hairColor);

		baby1.hairColor = "Brown";
		baby1.gender = 'F';
		System.out.println("The hair color of baby1 is -> " + baby1.hairColor);

		System.out.println("--------------------------------");

		// Declaring a variable of type Baby
		Baby baby2;
		// System.out.println("The name of baby2 is -> " + baby2.name);

		// Creating a baby and assigning it to the variable baby2
		baby2 = new Baby();
		System.out.println("The name of baby2 is -> " + baby2.name);

		baby2.name = "Aziz";
		baby2.gender = 'M';
		baby2.weight = 8;
		baby2.hairColor = "Black";

		System.out.println("The hair color of baby1 is -> " + baby1.hairColor);
		System.out.println("The hair color of baby2 is -> " + baby2.hairColor);

		System.out.println("--------------------------------");

		baby1.cry();
		baby2.cry();

		baby1.talk();

		System.out.println("--------------------------------");

		baby1.displayInformation();
		baby2.displayInformation();

	}

}