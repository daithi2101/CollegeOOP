package christmas2015;
import java.util.Scanner;
/*
 * Created by David on 13/10/2016.
 */
public class Question4_2015 {
    public static void main(String args[]) {
        String ppsNumber;
        int i;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a PPS number: ");
        ppsNumber = input.nextLine();

        if(ppsNumber.length() == 8 || ppsNumber.length() ==9) {
            for(i = 0; i < 7; i++) {
                if(!(ppsNumber.charAt(i) >= '0' && ppsNumber.charAt(i) <= '9')){
                    System.out.println("\nInvalid PPS number. At least one of the first seven characters were not digits");
                    break;
                }
            }
            while(i >= 7 && i < ppsNumber.length()) {
                if(ppsNumber.charAt(i) >= 'A' && ppsNumber.charAt(i) <= 'Z')
                    i++;
                else{
                    System.out.println("\nInvalid PPS number. The last or second-last character, or both, were not " +
                            "uppercase letters");
                    break;
                }
            }
            if(i == ppsNumber.length())
                System.out.println("\nYou entered a valid PPS number");
        } else
            System.out.println("\nInvalid PPS number. It must contain 8 or 9 characters");
        input.close();
    }
}
