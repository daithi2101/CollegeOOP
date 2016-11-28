package lab5;
import java.util.Scanner;

/*
 * Created by David on 08/10/2016.
 */
public class Exercise3 {
    public static void main(String args[]) {
        int choice;
        final float PI = 3.142f;
        float radius;


        Scanner input = new Scanner(System.in);

        System.out.print("\t\t\t1.Calculate the area of a circle\n");
        System.out.print("\t\t\t2.Calculate the volume of a sphere\n");
        System.out.print("\t\t\t3.Quit\n");

        System.out.print("\nPlease enter your choice <1-3>: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("\nPlease enter the radius of the circle: ");
                radius = input.nextFloat();

                float areaOfCircle = (PI * radius * radius);
                System.out.print("\nThe area of the circle is " + String.format("%.3f", areaOfCircle) + " metres squared");
                break;
            case 2:
                System.out.print("\nPlease enter the radius of the sphere: ");
                radius = input.nextFloat();

                float volumeOfSphere = (4 * PI * radius * radius * radius / 3);
                System.out.print("\nThe area of the circle is " + String.format("%.3f", volumeOfSphere) + " metres cubed");
                break;
            case 3:
                System.out.print("\nThanks for using the system. Goodbye!");
                break;
            default:
                System.out.print("\nSorry - you must have entered an invalid choice - must be between 1 and 3");
        }
        input.close();
    }
}
