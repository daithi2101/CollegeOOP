package lab4;
import java.util.Scanner;

/*
 * Created by David O Connor on 03/10/2016.
 */
public class Exercise2 {
    public static void main(String args[]){
        int grossIncome;
        int pensionPayments;
        int cutOffPoint;
        int taxCredits;
        final float PAYE;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your gross income: ");
        grossIncome = input.nextInt();

        System.out.print("Please enter your pension payment: ");
        pensionPayments = input.nextInt();

        System.out.print("Please enter your cut-off point: ");
        cutOffPoint = input.nextInt();

        System.out.print("Please enter your tax-credits: ");
        taxCredits = input.nextInt();

        if (grossIncome > cutOffPoint) {
            PAYE = (0.2f * cutOffPoint) + (0.42f * (grossIncome - cutOffPoint - pensionPayments)) - (taxCredits);
        } else {
            PAYE = (0.2f * (grossIncome - pensionPayments)) - (taxCredits);
        }

        String formatString = String.format("%s%.2f", "\nThe PAYE dur by this employee is EUR", PAYE);

        System.out.print(formatString);

        input.close();
    }
}
