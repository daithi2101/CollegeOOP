//David O'Connor 5/10/2015
//A short program to demo keyboard input
package kcfeStuff.oopStuff;

import java.util.Scanner;

public class KeyboardInput {
	
	public static void main(String[] args) {
		int age;									// expecting a number and will cause an exception if you type a
													// word
		String name;
													// object reference object
		Scanner keyboard = new Scanner(System.in);	// using ref from
													// java.util.scanner
													// now accepts keybord input
													// information

		System.out.print("Enter name here:");		// no ln here as you want to type
													// on the same line
		name = keyboard.nextLine();

		System.out.println("Hello " + name);

		System.out.print("How old are you? ");
		age = keyboard.nextInt();

		System.out.println("You are young");

		System.out.println("You are " + age * 7 + " in dog years");

		// or
		int dogYears = age * 7;
		System.out.println("you are " + dogYears + " in dog years");

		// or
		System.out.print("You are ");
		System.out.print(dogYears);
		System.out.println(" in dog years");

		keyboard.close();
	}
	
}
