package lab3;
// Created by David O Connor on 26/09/2016.
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		final float PI = 3.142f;
		float r;
		float h;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the radius of the cylinder: ");
		r = input.nextFloat();
		
		System.out.print("Please enter the height of the cylinder: ");
		h = input.nextFloat();
		
		float v = PI * r * r * h; 
		String formatString = String.format("%s%.2f%s","Volume of cylinder is ",v," metres squared");
		System.out.print(formatString);
		
		input.close();
	}
}
