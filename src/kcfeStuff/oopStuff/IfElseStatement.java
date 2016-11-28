package kcfeStuff.oopStuff;

import java.util.Scanner;

public class IfElseStatement {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;

		System.out.print("Enter your age: ");
		age = keyboard.nextInt();

		if (age >= 18)
			System.out.println("You are able to vote!");
		else
			System.out.println("You can't vote!");

		System.out.println("Enter a result:(0-100): ");
		int result = keyboard.nextInt();
		System.out.println("You've got a ");

		if (result >= 80) {
			System.out.println("distinction.");
		} else if (result >= 65) {
			System.out.println("merit.");
		} else if (result >= 50) {
			System.out.println("pass.");
		} else {
			System.out.println("unsuccesful.");
		}
		keyboard.close();
	}
	
}
