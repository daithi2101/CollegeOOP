package sampleAssessments;
import java.util.Scanner;

/*
 * Created by David O Connor on 07/10/2016.
 * Program that determines the ideal weight of a person based their gender, height and age
 */
public class SampleGroup3 {
    public static void main(String args[]) {

        String gender;
        float height;
        int age;
        float idealWeight;
        final float ONE_INCH = 0.0254f;    //Setting the value as a constant

        System.out.print("************Ideal Weight Calculator************\n");

        Scanner input = new Scanner(System.in);

        System.out.print("\nPlease enter your gender: ");
        //Set the gender of the person
        gender = input.nextLine();

        System.out.print("Please enter your height: ");
        //Set the height of the person
        height = input.nextFloat();

        System.out.print("Please enter your age: ");
        //Set the age of the person
        age = input.nextInt();

        //Display error message if the person is under 18 years old
        if(age < 18) {
            System.out.print("\n\nError: the age entered is too low for the Robinson formula to work ... exiting program now!");
        }
        //Display error message if the person's height is under 1.22m
        else if(height < 1.22) {
            System.out.print("\n\nError: the height entered is too low for the Robinson formula to work ... exiting program now!");
        } else {
            if(gender.equals("male")){
                //Formula to determine ideal weight of a man
                idealWeight = 29.2f + (1.9f * ((height-1.22f) / ONE_INCH));

                //Display the ideal weight of the man to the nearest whole number
                System.out.print("\n\nThe ideal weight of this person is " + String.format("%.0f",idealWeight) + "kg");
            } else {
                //Formula to determine ideal weight of a woman
                idealWeight = (28.6f + (1.7f * ((height - 1.22f) / ONE_INCH)));

                //Display the ideal weight of the woman to the nearest whole number
                System.out.print("\n\nThe ideal weight of this person is " + String.format("%.0f",idealWeight) + "kg");
            }
        }

        input.close();
    }
}
