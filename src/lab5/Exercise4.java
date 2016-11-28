package lab5;
import java.util.Scanner;

/*
 * Created by David on 09/10/2016.
 */
public class Exercise4 {
    public static void main(String args[]) {
        int monthNumber, daysInMonth;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the month number: ");
        monthNumber = input.nextInt();

        switch(monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                System.out.print("\nThe number of days in this month is " + daysInMonth);
                break;
            case 2:
                daysInMonth = 28;
                System.out.print("\nThe number of days in this month is " + daysInMonth);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                System.out.print("\nThe number of days in this month is " + daysInMonth);
                break;
            default:
                System.out.print("\nInvalid month");
        }

        input.close();
    }
}
