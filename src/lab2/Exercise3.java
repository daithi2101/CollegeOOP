package lab2;
// Created by David O Connor on 19/09/2016.

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		String name, address;
		float weight, height;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		name = input.nextLine();
		
		System.out.println("Please enter your weight: ");
		weight = input.nextFloat();
		
		System.out.println("Please enter your height: ");
		height = input.nextFloat();
		
		System.out.println("Please enter your address: ");
		input.nextLine();
		address = input.nextLine();
		
		
		System.out.println("\n\n\nName: " + name + "\nWeight: " + weight + "kg" + "\nHeight: " + height + "m" +"\nAddress: " + address + "\n");
		
		input.close();
	}

}
