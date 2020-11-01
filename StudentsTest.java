package edu.smg;

import java.util.Scanner;

public class StudentsTest {
	public static void main(String[] args) {
		Students[] student = new Students[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("Name?");
			String name = sc.next();
			System.out.println("Grade?");
			double grade = sc.nextDouble();
			student[i] = new Students(name, grade);
		}
		sc.close();
		hasScholarship(student);
	}
	public static void hasScholarship(Students student[]) {
		for(Students st : student) {
			if(goodGrades(st)) {
				System.out.println(st.name + " has scholarship!");
			}
		}
	}
	public static boolean goodGrades(Students st) {
		return st.grade > 5.5;
	}
}
