package christmas2015;
import java.util.Scanner;
/*
 * Created by David on 13/10/2016.
 */
public class Question4_2015 {
    public static void main(String args[]) {
        String ppsNumber;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a PPS number: ");
        ppsNumber = input.nextLine();

        if(ppsNumber.length() == 8) {
            for(int x = 0; x < (ppsNumber.length() - 1); x++) {
                if(!(ppsNumber.charAt(x) >= '0' && ppsNumber.charAt(x) <= '9')) {
                    System.out.print("\nInvalid PPS number. At least one of the first seven characters were not digits");
                    break;
                }
            }
            if(!(ppsNumber.charAt(7) >= 'A' && ppsNumber.charAt(7) <= 'Z')) {
                System.out.print("\nInvalid PPS number. The last or second-last character, or both, were not " +
                        "uppercase letters");
            } else {
                System.out.print("\nYou entered a valid PPS number");
            }
        } else if(ppsNumber.length() == 9) {
            for(int x = 0; x < (ppsNumber.length() - 2); x++) {
                if (!(ppsNumber.charAt(x) >= '0' && ppsNumber.charAt(x) <= '9')) {
                    System.out.print("\nInvalid PPS number. At least one of the first seven characters were not digits");
                    break;
                }
            }
            if (!((ppsNumber.charAt(7) >= 'A' && ppsNumber.charAt(7) <= 'Z') && (ppsNumber.charAt(8) >= 'A' &&
                    ppsNumber.charAt(8) <= 'Z'))) {
                System.out.print("\nInvalid PPS number. The last or second-last character, or both, were not " +
                        "uppercase letters");
            } else {
                System.out.print("\nYou entered a valid PPS number");
            }
        }
        else {
            System.out.print("\nInvalid PPS number. It must contain 8 or 9 characters");
        }
        input.close();
    }
}
