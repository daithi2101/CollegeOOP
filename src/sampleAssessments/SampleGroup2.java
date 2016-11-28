package sampleAssessments;
import java.util.Scanner;

/*
 * David
 * Program to determine if entered co-ordinates create a rectangle and if that rectangle is a square
 */
public class SampleGroup2 {
    public static void main(String args[]){

        int upperLeftPointX;
        int upperLeftPointY;
        int bottomRightPointX;
        int bottomRightPointY;

        Scanner input = new Scanner(System.in);

        System.out.print("\t\t------------Square Determination------------\n\n");

        System.out.print("Please enter the x-coordinate of the upper-left point: ");
        //Set value for upper-left X co-ordinate
        upperLeftPointX = input.nextInt();

        System.out.print("Please enter the y-coordinate of the upper-left point: ");
        //Set value for upper-left Y co-ordinate
        upperLeftPointY = input.nextInt();

        System.out.print("Please enter the x-coordinate of the bottom-right point: ");
        //Set value for bottom-right X co-ordinate
        bottomRightPointX = input.nextInt();

        System.out.print("Please enter the y-coordinate of the bottom-right point: ");
        //Set value for bottom-right Y co-ordinate
        bottomRightPointY = input.nextInt();

        //Display error message if the bottom-right X co-ordinate has a higher value than the upper-left X co-ordinate
        if(bottomRightPointX < upperLeftPointX) {
            System.out.print("\n\nError! The bottom-right x-coordinate is invalid ...... quitting program");
        }
        //Display error message if the bottom-right Y co-ordinate has a higher value than the upper-left Y co-ordinate
        else if(bottomRightPointY > upperLeftPointY){
            System.out.print("\n\nError! The bottom-right y-coordinate is invalid ...... quitting program");
        }
        //State if the rectangle is a square
        else if((bottomRightPointX - upperLeftPointX) == (upperLeftPointY - bottomRightPointY)){
            System.out.print("\n\nThe rectangle described by these points is a square");
        }
        //State if the rectangle isn't a square
        else {
            System.out.print("\n\nThe rectangle described by these points is not a square");
        }

        input.close();

    }
}
