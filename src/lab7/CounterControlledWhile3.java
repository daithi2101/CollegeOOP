package lab7;
import java.util.Scanner;
/*
 * David O Connor        07/11/2016.
 * Program to determine the largest and smallest of 10 digits using a counter controlled while loop
 */
public class CounterControlledWhile3 {
    public static void main(String[] args) {
        float number, largest = 0, smallest = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);

        while(count < 10) {
            System.out.print("Please enter number no." + (count + 1) + ": ");
            number = input.nextFloat();

            if(count == 0) {
                largest = number;
                smallest = number;
            } else {
                if(number > largest)
                    largest = number;
                else if(number < smallest)
                    smallest = number;
            }

            count++;
        }
        System.out.println("\n\n\n=================================" +
                "\n\t\tProgram Results" +
                "\n=================================" +
                "\n\nLargest number is " + largest + "" +
                "\nSmallest number is " + smallest);
    }
}
