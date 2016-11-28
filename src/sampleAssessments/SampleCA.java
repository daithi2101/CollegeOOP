package sampleAssessments;
import java.util.Scanner;

// SampleCA.java
/*
 * David O Connor                                                                            19/10/2016
 * Simple program to determine the approx mass of the sun using Keplar's third law of planetary motion
 */
public class SampleCA {
    public static void main(String args[]) {
        final float GRAVITY = 6.67428E-11f;
        final float PI = 3.142f;

        Scanner input = new Scanner(System.in);

        System.out.print("\t\t--------------Sun Mass Calculator-----------\n");

        System.out.print("\nPlease enter the radius of the planet's orbit around the sun: ");
        float radius = input.nextFloat();

        if(radius <= 0) {
            System.out.print("\nError! The radius of the orbit must be positive .... quitting now");
        } else {
            System.out.print("Please enter the period of rotation for the planet in days: ");
            float rotationalPeriodDays = input.nextFloat();

            if (rotationalPeriodDays <= 0) {
                System.out.print("\nError! The period of rotation must be positive .... quitting now");
            } else {
                float rotationalPeriodSeconds = (rotationalPeriodDays * 24f * 60f * 60f);
                System.out.print("\nThere are " + String.format("%.0f", rotationalPeriodSeconds) + " seconds in " +
                        rotationalPeriodDays + " days");

                System.out.print("\nThe approximate mass of the sun is " + String.format("%.0f", ((float)(4 * (Math.pow(PI, 2)) *
                        (Math.pow(radius, 3))) / (GRAVITY * Math.pow(rotationalPeriodSeconds, 2))))
                        + " kg");
            }
        }
    }
}
