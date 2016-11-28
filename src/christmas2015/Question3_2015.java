package christmas2015;
import java.util.Scanner;

/*
 * Created by David on 12/10/2016.
 */
public class Question3_2015 {
    public static void main(String args[]) {
        int i = 1, x = 0, number, oddNumbers = 0, evenNumbers = 0, divisibleBy3And5 = 0, greaterThan250 = 0;

        Scanner input = new Scanner(System.in);

        while(i <= 15){
            System.out.print("Loop " + i + " - Please enter a whole number: ");
            number = input.nextInt();

            if((number % 2) == 1) {
                oddNumbers += 1;
            } else {
                evenNumbers += 1;
            }

            if(number % 3 == 0 && number % 5 == 0) {
                divisibleBy3And5 += 1;
            }

            if(number > 250) {
                greaterThan250 += 1;
            }

            x += number;
            i++;
        }

        System.out.print("\n******** Statistics on Values Entered ********\n");
        System.out.print("\nThe number of odd numbers entered is " + oddNumbers);
        System.out.print("\nThe number of even numbers entered is " + evenNumbers);
        System.out.print("\nThe average of the numbers entered is " + String.format("%.0f", ((float)x / 15)));
        System.out.print("\nThe number of values divisible by both 3 and 5 is " + divisibleBy3And5);
        System.out.print("\nThe percentage of numbers that exceed 250 is " + String.format("%.3f%s", (((float)greaterThan250 / 15) * 100), "%"));

        input.close();
    }
}
