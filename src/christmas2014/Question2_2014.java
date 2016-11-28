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
            System.out.print("Error: the number is not positive .... exiting program now");
        } else {
            if(number % 2 == 0)
                System.out.print("The number entered is even");
            else
                System.out.print("The number entered is odd");
        }
    }
}
