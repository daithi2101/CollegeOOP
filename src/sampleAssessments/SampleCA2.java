package sampleAssessments;
import java.util.Scanner;
import java.util.StringJoiner;

/*
 * Created by David O Connor on 30/11/2016.
 */
public class SampleCA2 {
    public static void main(String[] args) {
        int count = 0, validEntries = 0;
        String number;

        Scanner input = new Scanner(System.in);

        while(count < 5) {
            int i = 0;

            System.out.print("Loop " + (count + 1) + " - Please enter a string value: ");
            number = input.nextLine();

            while (i < number.length()) {
                char ch = number.charAt(i);

                if (ch >= '0' && ch <= '9')
                    i++;
                else {
                    System.out.println("\nThe string does not represent a valid whole number\n");
                    break;
                }

                if(i == number.length()){
                    if(number.length() < 3)
                        System.out.println("\nThere are fewer than 3 characters in the number entered");
                    else
                        System.out.println("\nThe 3rd digit in the number is " + number.charAt(2));

                    if(number.charAt((i - 1)) == '2' || number.charAt((i - 1)) == '4' || number.charAt((i - 1)) == '6' ||
                            number.charAt((i - 1)) == '8' || number.charAt((i - 1)) == '0')
                        System.out.println("The number entered is even");
                    else
                        System.out.println("The number entered is odd");

                    if(number.length() < 7)
                        System.out.println("The number entered is less than 1000000\n");
                    else
                        System.out.println("The number entered is at least 1000000\n");
                }

                if(i == number.length())
                    validEntries++;
            }
            count++;
        }

        System.out.println("\n\n\nThe percentage of whole number values entered was: " + String.format("%.0f",
                (((float)validEntries / (float)5)) * (float)100) + "%");

        input.close();
    }
}
