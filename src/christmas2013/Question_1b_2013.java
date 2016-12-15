package christmas2013;
import java.util.Scanner;
/*
 * Created by Dave on 15-Dec-16.
 */
public class Question_1b_2013 {
    public static void main(String[] args) {
        float radius, height;
        final float PI = 3.142f;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter radius of cylinder: ");
        radius = input.nextFloat();

        System.out.print("Please enter height of cylinder: ");
        height = input.nextFloat();

        System.out.println("\n\nThe surface area of the cylinder is " + String.format("%.3f",
                ((2 * PI * radius * radius) + (2 * PI * radius * height))) + "m squared");
    }
}
