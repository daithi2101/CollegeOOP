package sampleAssessments;
import java.util.Scanner;
/*
 * Created by David O Connor on 22/11/2016.
 */
public class SampleGroup4Assessment2 {
    public static void main(String[] args) {
        String multiplesOfFour = "";
        int smallestNumber = 0, largestNumber = 0, oddNumbers = 0, numNumbers = 0, total = 0,
                number;
        float percentage3Digits = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a positive whole number (under 0 to exit): ");
        number = input.nextInt();

        while(!(number < 0)) {
            total += number;

            if(numNumbers == 0) {
                smallestNumber = number;
                largestNumber = number;
            } else if(number < smallestNumber)
                smallestNumber = number;
            else if(number > largestNumber)
                largestNumber = number;

            if((number % 2) != 0)
                oddNumbers++;

            if(number >= 100 && number <= 999)
                percentage3Digits++;

            if(((number % 4) == 0) && number != 0)
                multiplesOfFour += String.format("%d%s", number, " ");

            numNumbers++;

            System.out.print("Please enter a another positive whole number (under 0 to exit): ");
            number = input.nextInt();
        }
        if(numNumbers == 0)
            System.out.println("\nYou entered no positive whole numbers ... exiting program now");
        else
            System.out.println("\nSmallest number entered: " + smallestNumber +
                "\nLargest number entered: " + largestNumber +
                "\nAverage of numbers entered: " + String.format("%.2f", ((float)total / (float)numNumbers)) +
                "\nOdd numbers entered: " + oddNumbers +
                "\nPercentage of 3 digit number: " + String.format("%.0f", (percentage3Digits / (float)numNumbers)
                * 100f) + "%" +
                "\nList of multiples of 4: " + multiplesOfFour);
    }
}
