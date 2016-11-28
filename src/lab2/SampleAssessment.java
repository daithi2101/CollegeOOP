package lab2;
import java.util.Scanner;
// Created by David O Connor on 19/09/2016.

public class SampleAssessment {

	public static void main(String[] args) {
		
		float weight;
		int purity;
		String metalName = "Gold";
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter the weight of the gold: ");
		weight = input.nextFloat();
		
		System.out.println("Please enter the purity of the gold: ");
		purity = input.nextInt();
		
		System.out.println("\n\t=========================================="
				+ "\n\t\t\tMetal Details\n\t==========================================\n");
		
		String formatString = String.format("%-10s%s\n%-10s%.3f\n%-10s%d", "Name: ", metalName, "Weight: ", weight, "Purity: ", purity);
		
		System.out.println(formatString);
		
		input.close();
	}

}
