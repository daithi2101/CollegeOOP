package lab2;
// Created by David O Connor on 19/09/2016.

import java.util.Scanner;

public class ReadingIntegerInput {

	public static void main(String[] args) {

		int numberOfCPU, RAM;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of CPUs in your computer: ");
		numberOfCPU = input.nextInt();
		
		System.out.println("Please enter the amount of RAM in MB: ");
		RAM = input.nextInt();
		
		System.out.println("\n\n\nThe details you entered were as follows:\n " + "CPUS: " + numberOfCPU + "\nAmount of RAM: " + RAM + "MB\n\n\n");
		
		input.close();
	}

}
