package christmas2013;
import java.util.Scanner;
/*
 * Created by Dave on 15-Dec-16.
 */
public class Question_2b_2013 {
    public static void main(String[] args) {
        int measurement;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the Richter scale measurement: ");
        measurement = input.nextInt();

        switch(measurement) {
            case 1:
            case 2:
            case 3:
                String effects = "Detectable only by instruments";
                System.out.println("\n" + effects);
                break;
            case 4:
                effects = "Detectable within 32km of epicentre";
                System.out.println("\n" + effects);
                break;
            case 5:
                effects = "May cause slight damage";
                System.out.println("\n" + effects);
                break;
            case 6:
                effects = "Moderately destructive";
                System.out.println("\n" + effects);
                break;
            case 7:
                effects = "A major earthquake";
                System.out.println("\n" + effects);
                break;
            case 8:
            case 9:
                effects = "A very destructive earthquake";
                System.out.println("\n" + effects);
                break;
            default:
                effects = "Error: You entered an invalid measurement value!";
                System.out.println("\n" + effects);
        }
    }
}
