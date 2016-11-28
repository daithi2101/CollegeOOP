package sampleAssessments;
import java.util.Scanner;
/*
 * Created by David O Connor on 21/11/2016.
 */
public class SampleGroup2Assessment2 {
    public static void main(String[] args) {
        String isbn, isbnList = "";
        int invalidEntries = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a first ISBN (q to quit): ");
        isbn = input.nextLine();

        while(!isbn.equalsIgnoreCase("q")){
            if(isbn.length() == 10) {
                int count = 0;

                while(count < 9) {
                    if (isbn.charAt(count) >= '0' && isbn.charAt(count) <= '9') {
                        count++;
                    } else{
                        invalidEntries++;
                        System.out.println("ISBN is invalid as the first 9 characters are not all digits!!");

                        System.out.print("\nPlease enter a another ISBN (q to quit): ");
                        isbn = input.nextLine();
                    }
                }
                if(count == 9) {
                    if ((isbn.charAt(count) >= '0' && isbn.charAt(count) <= '9') || isbn.charAt(count) == 'X') {
                        isbnList = (isbnList + isbn + " ");
                        System.out.println("ISBN is valid");

                        System.out.print("\nPlease enter a another ISBN (q to quit): ");
                        isbn = input.nextLine();
                    } else {
                        invalidEntries++;
                        System.out.println("ISBN is invalid as it doesn't end with a digit or an X!!");

                        System.out.print("\nPlease enter a another ISBN (q to quit): ");
                        isbn = input.nextLine();
                    }
                }
            }else {
                invalidEntries++;
                System.out.println("ISBN is invalid as it doesn't contain exactly 10 characters!!");

                System.out.print("\nPlease enter a another ISBN (q to quit): ");
                isbn = input.nextLine();
            }
        }
        if(isbnList.length() == 0)
            System.out.println("\nNo ISBN values entered ... exiting program now");
        else
            System.out.println("\n\n*****************************" +
                    "\n\t\tISBN Stats" +
                    "\n*****************************" +
                    "\n\nNumber of invalid values entered: " + invalidEntries +
                    "\nList of valid ISBN: " + isbnList);
    }
}
