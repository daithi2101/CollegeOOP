package lab3;
import java.util.Scanner;
// Created by David O Connor on 26/09/2016.
public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float u, t , a;	
		
		System.out.print("************Distance Calculator************\n\n\n");
		
		System.out.print("Please enter the initial speed: ");
		u = input.nextFloat();
		
		System.out.print("Please enter the acceleration: ");
		a = input.nextFloat();
		
		System.out.print("Please enter the time spent travelling: ");
		t = input.nextFloat();
		
		final float DISTANCE = ((u * t) + (.5f * a * t * t));
		
		String formatString = String.format("%s%.2f%s", "The object travelled a distance of ", DISTANCE, " metres");
		System.out.println();
		System.out.print(formatString);
 		
		input.close();
	}	
}
