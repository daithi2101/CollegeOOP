package christmas2014;
import java.util.Scanner;
/*
 * Created by David O Connor on 28/11/2016.
 */
public class Question2_2014 {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a positive whole number: ");
        number = input.nextInt();

        if(number <= 0) {
            System.out.print("\nError: the number is not positive .... exiting program now");
        } else {
            if(number % 2 == 0)
                System.out.print("\nThe number entered is even");
            else
                System.out.print("\nThe number entered is odd");

            if(number % 10 == 0)
                System.out.print("\nThe number ends in a zero");
            else
                System.out.print("\nThe number does not end in a zero");

            if(number >= 1 && number <= 255)
                System.out.print("\nThe corresponding ASCII code this number is " + (char)number);
            else
                System.out.print("\nThere is no corresponding ASCII code for this number");
        }

        input.close();
    }
}
