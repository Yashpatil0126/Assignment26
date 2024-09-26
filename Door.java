package assignment26;

import java.util.*;

public class Door {

	private int validId;
	private int validCard;
	private int admin;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter valid ID (1 is for yes and 0 is for false) :");
		validId = sc.nextInt();
		System.out.println("Enter valid Card (1 is for yes and 0 is for false) :");
		validCard = sc.nextInt();
		System.out.println("Enter Admin (1 is for yes and 0 is for false) :");
		admin = sc.nextInt();
	}

	public void display() {
		System.out.println("validID : " + validId);
		System.out.println("valid Card : " + validCard);
		System.out.println("Admin : " + admin);
	}

	public void access() {
		if (validId == 1 && validCard == 1 || admin == 1) {
			System.out.println("Access Granted...");
		} else {
			System.out.println("Access Denied..");
		}
	}
}
