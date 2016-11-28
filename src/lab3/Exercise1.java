package lab3;
// Created by David O Connor on 26/09/2016.

public class Exercise1 {
	
	public static void main(String[] args){
		
		int a = 5, b = 3, c = 2, x = a * b % c - 4 + 6;
		
		System.out.print("The value of a is " + a);
		System.out.print("The value of b is " + b);
		System.out.print("The value of c is " + c);
		
		System.out.println("\nThe value of the expression a * b % c - 4 + 6 is " + x);
	}
}
