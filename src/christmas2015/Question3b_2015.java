package christmas2015;
import java.util.Scanner;

/*
 * Created by David on 12/10/2016.
 */
public class Question3b_2015 {
    public static void main(String args[]) {
        int i = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a binary number: ");
        String binary = input.nextLine();

        while(i < binary.length()) {

            char digit = binary.charAt(i);

            if(!(digit == '0' || digit == '1')) {
                System.out.print("\nThe value you entered is not a valid binary number");
                break;
            }
            i++;
            i += i;
        }
        if ((i + 1) == 15) {
            System.out.print("\nThe value you entered is a valid binary number");
        }
        input.close();
    }
}
