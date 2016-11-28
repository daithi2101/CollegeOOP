package christmas2014;
import java.util.Scanner;
/*
 * Created by David O Connor on 18/11/2016.
 */
public class Question1b2014 {
    public static void main(String[] args) {
        float initialSpeed, finalSpeed, acceleration;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the initial speed of the object: ");
        initialSpeed = input.nextFloat();

        System.out.print("Please enter the final speed of the object: ");
        finalSpeed = input.nextFloat();

        System.out.print("Please enter the acceleration of the object: ");
        acceleration = input.nextFloat();

        System.out.println("\nThe distance traveled by the object is " + String.format("%.0f",
                ((finalSpeed * finalSpeed) - (initialSpeed * initialSpeed)) / ((float)2 * acceleration)) + "m");
    }
}

