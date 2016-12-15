package christmas2013;
import java.util.Scanner;
/*
 * Created by Dave on 15-Dec-16.
 */
public class Question_2a_2013 {
    public static void main(String[] args) {
        String dob;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your date of birth in the form dd-mm-yyyy: ");
        dob = input.nextLine();

        if((dob.charAt(3) == '0' && dob.charAt(4) == '1') || (dob.charAt(3) == '1' && (dob.charAt(4) == '1' ||
                dob.charAt(4) == '2')))
            System.out.println("\nYou were born in winter");
        else if(dob.charAt(3) == '0' && (dob.charAt(4) == '2' || dob.charAt(4) == '3' || dob.charAt(4) == '4'))
            System.out.println("\nYou were born in spring");
        else if(dob.charAt(3) == '0' && (dob.charAt(4) == '5' || dob.charAt(4) == '6' || dob.charAt(4) ==  '7'))
            System.out.println("\nYou were born in summer");
        else if(dob.charAt(3) == '0' && (dob.charAt(4) == '8' || dob.charAt(4) == '9') || (dob.charAt(3) == '1' &&
                dob.charAt(4) == '0'))
            System.out.println("\nYou were born in autumn");
    }
}
