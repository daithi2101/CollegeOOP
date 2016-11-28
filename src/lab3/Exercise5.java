package lab3;
import java.util.Scanner;
// Created by David O Connor on 26/09/2016.
public class Exercise5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final float G = 6.67300E-11f;
		float m1, m2;
		int d;
		
		System.out.print("Please enter the mass of the first object: ");
		m1 = input.nextFloat();
		
		System.out.print("Please enter the mass of the second object: ");
		m2 = input.nextFloat();
		
		System.out.print("Please enter the distance in metres between the objects: ");
		d = input.nextInt();
		
		final float F = ((G * m1 * m2) / ((float)d * d));
		
		System.out.print("\n\n******Reults of Program******\n\n");
		
		String formatString = String.format("%s%.2f%s\n%s%.2f%s\n%s%d%s\n%s%.2f%s", "The mass of the first object is ", m1, " kg",
			"The mass of the second object is ", m2, " kg", "The distance between the two objects is ", d, " m",
			"The force exerted on the objects is ", F, " N");
		System.out.print(formatString);	
			
		input.close();	
	}	
}
