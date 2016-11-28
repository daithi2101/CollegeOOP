package lab4;
import java.util.Scanner;

/*
 * Created by David O Connor on 04/10/2016.
 */
public class Exercise4 {
    public static void main(String args[]){

        int units;
        float cost;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the units used: ");
        units = input.nextInt();

        if(units <= 99) {
            cost = units * 0.05f;

            String formatString = String.format("%s%.2f", "\nThe cost of your mobile phone bill is EUR", + cost);
            System.out.print(formatString);
        } else if(units <= 299) {
            cost = (99 * .05f) + ((units - 99) * .03f);

            String formatString = String.format("%s%.2f", "\nThe cost of your mobile phone bill is EUR", + cost);
            System.out.print(formatString);
        } else if(units <= 399) {
            cost = (99 * .05f) + ((299 - 99) * .03f) + ((units - 299) * .02f);

            String formatString = String.format("%s%.2f", "\nThe cost of your mobile phone bill is EUR", + cost);
            System.out.print(formatString);
        } else {
            cost = (99 * .05f) + ((299 - 99) * .03f) + ((399 - 299) * .02f) + ((units - 399) * .01f);

            String formatString = String.format("%s%.2f", "\nThe cost of your mobile phone bill is EUR", + cost);
            System.out.print(formatString);
        }

        input.close();
    }
}
