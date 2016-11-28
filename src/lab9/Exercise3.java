package lab9;
import java.util.Scanner;
/*
 * Created by David O Connor on 21/11/2016.
 */
public class Exercise3 {
    public static void main(String[] args) {
        int numForTimesTable;

        Scanner input = new Scanner(System.in);

        System.out.print("What number do you wish to enter the times-table for? ");
        numForTimesTable = input.nextInt();

        while(!(numForTimesTable >= 1 && numForTimesTable <= 12)) {
            System.out.print("Invalid. You must enter a value from 1-12. Please re-enter: ");
            numForTimesTable = input.nextInt();
        }

        System.out.println("\n\n=====The " + numForTimesTable + "times table=====\n");

        for(int i = 0; i <= 12; i++) {
            System.out.println(numForTimesTable + " times " + i + " is " + (numForTimesTable * i));
        }

        input.close();
    }
}
