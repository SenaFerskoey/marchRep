package com.neotech.review05;

public class School {

	public static void main(String[] args) {

		// School s = new School();

		Student student1 = new Student();
		student1.name = "Klodjana";
		student1.studentNr = 999;
		student1.gradeLevel = 8;

		Student student2 = new Student();
		student2.gradeLevel = 1;
		student2.studentNr = 555;
		student2.name = "Donald";

		Teacher teacher = new Teacher();
		teacher.name = "Sabah";
		teacher.salary = 150000;
		teacher.subject = "Java";

		// Re-assigning the subject
		teacher.subject = "Selenium";

		System.out.println("--------------------------------");
		System.out.println("Let's call those methods");
		System.out.println("--------------------------------");

		student2.study();

		student2.sleep();

		student1.study();

		System.out.println("--------------------------------");

		teacher.teach();
		teacher.yellAtStudent(student2.name);
	}

}