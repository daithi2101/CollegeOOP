package kcfeStuff.oopStuff;
// David O'Connor    13/12/2015
import java.util.Scanner;

public class Calculator2 {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		char option;
		do{
			option = menu();
			
			if(option == 'A'){		// Addition
				double num1, num2;
				System.out.print("Enter first number: ");
				num1 = keyboard.nextDouble();
				System.out.print("Enter second number: ");
				num2 = keyboard.nextDouble();
				System.out.println(add(num1, num2));
			}else if(option == 'S'){	// Subtraction
				double num1, num2;
				System.out.print("Enter first number: ");
				num1 = keyboard.nextDouble();
				System.out.print("Enter second number: ");
				num2 = keyboard.nextDouble();
				System.out.println(sub(num1, num2));
			}
		}while(option != 'E');
	}
	public static char menu(){
		System.out.println();
		System.out.println("A\t\tAddition");
		System.out.println("S\t\tSubtraction");
		System.out.println("E\t\tExit");
		System.out.print("Enter an option: ");
		String answer;
		answer = keyboard.nextLine();
		if(answer.length() < 1)		// to solve scanner issue
			answer = "T";			// T is not a menu option
		answer = answer.toUpperCase();
		return answer.charAt(0);
	}
	
	public static double add(double num1, double num2){
		double sum;
		sum = num1 + num2;
		return sum;
	}
	
	public static double sub(double num1, double num2){
		return num1 - num2;
	}
	
}
