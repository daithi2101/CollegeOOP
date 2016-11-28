package sampleAssessments;
import java.util.Scanner;

/*
 * Created by David O Connor on 07/10/2016.
 * Program to determine the moment of inertia of a thin rectangular plate about an axis
 * perpendicular to the plate and going through its centre using the mass, length and
 * width of the plate
 */
public class SampleGroup4 {
    public static void main(String args[]) {

        float plateMass;
        float plateLength;
        float plateWidth;
        float momentOfInertia;

        System.out.print("======================================================\n" +
                "\t\tMoment of Inertia Calculator\n" +
        "======================================================");

        Scanner input = new Scanner(System.in);

        System.out.print("\n\nPlease enter the mass of the rectangle: ");
        //Set the value for the mass of the plate
        plateMass = input.nextFloat();

        //Set error message to display if the mass is less than zero (negative)
        if(plateMass < 0) {
            System.out.print("\nMass of the object cannot be negative ..... exiting program now!");
        }
        //Provided the mass is positive the program will now execute the following block of code
        else {
            System.out.print("Please enter the length of the plate: ");
            //Set the value for the length of the plate
            plateLength = input.nextFloat();
            //Set error message to display if the length is less than zero (negative)
            if(plateLength < 0) {
                System.out.print("\nLength of the object cannot be negative ..... exiting program now!");
            }
            //The following block of code will execute if the value of the mass and length are both greater than zero
            else {
                System.out.print("Please enter the width of the plate: ");
                //Set the value for the width of the plate
                plateWidth = input.nextFloat();

                //Formula to determine the moment of inertia
                momentOfInertia = (plateMass * ((plateLength * plateLength) + (plateWidth * plateWidth))) / 12;

                //Print out the moment of inertia of the plate correct to 3 decimal places
                System.out.print("\n\nThe moment of inertia of the rectangular plate is " + String.format("%.3f", momentOfInertia) + "kg m" + (char)178);
            }
        }
        input.close();
    }
}
