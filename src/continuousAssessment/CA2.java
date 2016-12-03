package continuousAssessment;
import java.util.Scanner;
//CA2.java					David O Connor	T00196827
/*
 *Program that tests the validity of a user-inputted PPS number using a while loop
 */
public class CA2 {
	public static void main(String[] args) {
		String ppsNumber;
		String validPPS = "";
			
		Scanner input = new Scanner(System.in);
			
		System.out.print("Please enter a PPS number (return to exit): ");
		ppsNumber = input.nextLine();
		
		while(!(ppsNumber.equals(""))) {
			if(ppsNumber.length() == 8 || ppsNumber.length() == 9) {
				int i = 0;
				
				while(i < 7){
					char ch = ppsNumber.charAt(i);
					
					if(ch >= '0' && ch <= '9'){
						i++;
					}else{
						System.out.println("\nInvalid PPS number. At least one of the first seven characters were not digits");
						break;						
					}
				}
				
				while(i >= 7 && i < ppsNumber.length()){
					char ch = ppsNumber.charAt(i);
					if(ch >= 'A' && ch <= 'Z'){
						i++;
					}else{
						System.out.println("\nInvalid PPS number. The last or second-last character, or both, were not uppercase letters");	
						break;
					}
				}
				
				if(i == ppsNumber.length()){
					validPPS = (validPPS + ppsNumber + " ");
					System.out.println("\nYou entered a valid PPS number");
				}
			}else{
				System.out.println("\nInvalid PPS number it must contain exactly 8 or 9 characters");
			}
			
			System.out.print("\n\nPlease enter another PPS number (return to exit): ");
			ppsNumber = input.nextLine(); 		
		} 
		if(validPPS.equals("")){
			System.out.println("\n\nYou entered no valid PPS numbers");
		}else{
			System.out.println("\n\nThe valid PPS numbers entered are: " + validPPS);
		}		
	}
}
 