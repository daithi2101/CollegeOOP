package sampleAssessments;
import java.util.Scanner;

/*
 * Created by David O Connor on 07/10/2016.
 * Program to determine the viscosity of a liquid using density of fluid and ball bearing
 * and radius & velocity of ball bearing
 */
public class SampleGroup1 {
    public static void main(String args[]){

        int pBallBearing;
        int pFluid;
        final float G = 9.8f;   //Setting the value as a constant
        float a;
        float v;

        Scanner input = new Scanner(System.in);

        System.out.print("***********Viscosity Calculator***********\n");

        System.out.print("Please enter the density of the ball-bearing: ");
        //Set value for the density of the ball-bearing
        pBallBearing = input.nextInt();

        //Set the program to display error message if density of the ball-bearing is negative
        if(pBallBearing < 0){
            System.out.print("\nError! The density of the ball-bearing must be positive ..... now quitting program");
        }
        //Provided the density of the ball-bearing is positive the following block of code will now execute
        else {
            System.out.print("Please enter the density of the fluid: ");
            //Setting value for the density of the liquid
            pFluid = input.nextInt();
            //Set the program to display error message if density of the fluid is negative
            if(pFluid < 0){
                System.out.print("\nError! The density of the fluid must be positive ..... now quitting program");
            } else {
                System.out.print("Please enter the radius of the ball-bearing: ");
                //Set value of the ball-bearing's radius
                a = input.nextFloat();

                System.out.print("Please enter the velocity of the ball-bearing: ");
                //Set value of the ball-bearing's velocity
                v = input.nextFloat();

                //Formula determining the viscosity of a liquid
                float viscosity = (2 * (pBallBearing - pFluid) * G * a * a) / (9 * v);

                //Display the viscosity of the fluid correct to 2 decimal places
                System.out.print("\nThe viscosity of the fluid is " + String.format("%.2f",viscosity)+ "Pa s");
            }
        }
        input.close();
    }
}
