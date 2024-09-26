package assignment26;

import java.util.*;

public class Vote {
	private String name;
	private int age;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter name :");
		name = sc.next();
		System.out.println("Enter age :");
		age = sc.nextInt();
	}

	public void vote() {
		if (age >= 18 && age <= 100) {
			System.out.println("You're eligible for voting");
		} else {
			System.out.println("You're not eligible for voting");
		}

	}

	public void display() {
		System.out.println("Name of person is : " + name);
		System.out.println("Age of person is : " + age);
	}
}