package lab3;
import java.util.Scanner;
// Created by David O Connor on 26/09/2016.
public class Exercise3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		float acre;
		final float CONVERSION = 0.4046f;
		
		System.out.print("Please enter an area in acre: ");
		acre = input.nextFloat();
		
		String formatString = String.format("%s%.3f%s", "This is equivalent to ", (CONVERSION * acre) , " hectares");
		System.out.print("\n\n" + formatString);
		
		input.close();	
	}	
}
