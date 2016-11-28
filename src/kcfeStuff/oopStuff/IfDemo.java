// David O'Connor 12/10/2015
// A short program to demo if statements
package kcfeStuff.oopStuff;

import java.util.Scanner;

public class IfDemo {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;

		System.out.print("Enter your age: ");
		age = keyboard.nextInt();

		if (age >= 18) {

			System.out.println("You can vote.");
		} else {
			System.out.println("You cant vote yet.");
		}

		System.out.print("Enter a result(0-100): ");
		int result = keyboard.nextInt();
		System.out.print("You got a ");

		if (result >= 80) {

			System.out.println("distinction.");
		} else if (result >= 65) {
			System.out.println("merit");
		} else if (result >= 50) {
			System.out.println("pass");
		} else {
			System.out.println("unsuccesful.");
		}
		if (age >= 21) {
			System.out.println("you can drink in the USA");
			System.out.println("but you will be asked for id");
		}

		keyboard.close();
	}
	
}
