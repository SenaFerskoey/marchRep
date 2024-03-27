package com.neotech.review05;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Pershendetje";

		System.out.println(str.length());

		System.out.println(str.isEmpty());

		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		System.out.println(str); // The original has NOT changed

		boolean equal = str.equals("PERSHENDETJE");
		System.out.println("equal -> " + equal);

		System.out.println(str.equalsIgnoreCase("PERSHENDETJE"));

		System.out.println("--------------------------------");

		System.out.println(str.contains("SH"));
		System.out.println(str.contains("SH".toLowerCase()));

		boolean start = str.startsWith("per");
		System.out.println(start);

		System.out.println("Does Pershendetje start with Pershendetje?");
		System.out.println(str.startsWith("Pershendetje"));

		System.out.println("Does Pershendetje end with E?");
		System.out.println(str.endsWith("E"));

		System.out.println("--------------------------------");

		String name = "Seniz" + "-" + "Etgin";
		System.out.println(name);

		String name2 = "Seniz".concat("-").concat("Etgin"); // Method chaining
		System.out.println(name2);

		String name3 = "Seniz".toUpperCase().concat("-").concat("Etgin");
		System.out.println(name3);

		// "Seniz".length().concat("Etgin"); // Compile Time Error
		// 5.concat("Etgin");
		"Seniz".concat("Etgin").length(); // This is OK
		System.out.println("Seniz".concat("Etgin").length());

		System.out.println("--------------------------------");

		String str2 = "         Buket     is    Twin   ";
		System.out.println(str2.trim());
		System.out.println(str2.trim().length());

		System.out.println("--------------------------------");

		String str3 = "Umed is very happy";
		char letter = str3.charAt(3);
		System.out.println(letter);

		System.out.println("index of letter 'e' is -> " + str3.indexOf('e'));

		// Find the index of letter 'e', but start looking after index 3
		int indexOfSecondE = str3.indexOf('e', 3);
		System.out.println("indexOfSecondE -> " + indexOfSecondE);

	}

}