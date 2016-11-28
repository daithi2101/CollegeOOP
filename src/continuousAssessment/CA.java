package continuousAssessment;
/*
 * 
 *  David O Connor			26/09/2016
 *  First Continuous Assessment
 *  
 */
import java.util.Scanner;

public class CA {

	public static void main(String[] args) {
		
		float clockSpeed = 2.6666f;
		String processorType;
		int processorYear;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the type of the processor: ");
		processorType = input.nextLine();
		
		System.out.println("Please enter the year in which the processor was released: ");
		processorYear = input.nextInt();
		
		System.out.println("\n***********************************\n\n\tProcessor Details\n\n***********************************\n");

		String processorDetails = String.format("%-20s%s\n%-20s%.2f GHz\n%-20s%d", "Processor Type: ", processorType, "Processor Speed: ", clockSpeed, "Year Released: ", processorYear );
		
		System.out.println(processorDetails);
		
		input.close();
	}

}
