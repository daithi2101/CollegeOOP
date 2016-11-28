package lab6;
import java.util.Scanner;
//DataSentinelWhile.java        David O Connor
/*
 Simple program to determine the number of students & the average height of an
 arbitrarily sized group of students using a data-sentinel while loop
 */
public class DataSentinelWhile {
    public static void main(String[] args) {
        float height, totalHeight = 0;
        int numProcessed = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the height of the student " + (numProcessed + 1) + " (-1 ot exit): ");
        height = input.nextFloat();

        while (height != -1) {
            totalHeight += height;
            numProcessed++;

            System.out.print("Please enter the height of the student " + (numProcessed + 1) + " (-1 to exit): ");
            height = input.nextFloat();
        }

        if (numProcessed != 0) {
            System.out.println("\n\nThe number of students processed is " + numProcessed + "\nThe average height of the students is " + String.format("%.2f", totalHeight / numProcessed) + " m");
        }
    }
}
