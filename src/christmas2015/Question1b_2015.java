package christmas2015;
import java.util.Scanner;

/*
 * Created by David O Connor on 12/10/2016.
 */
public class Question1b_2015 {
    public static void main(String args[]) {
        int energy;
        float mass, originalTemp, finalTemp;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the energy supplied to the block: ");
        energy = input.nextInt();

        System.out.print("Please enter the mass of the block: ");
        mass = input.nextFloat();

        System.out.print("Please enter the original temperature of the block: ");
        originalTemp = input.nextFloat();

        System.out.print("Please enter the final temperature of the block: ");
        finalTemp = input.nextFloat();

        float specificHeatCapacity = ((energy) / (mass * (finalTemp - originalTemp)));

        System.out.print("\nThe SHC of aluminium block is " + String.format("%.1f%s", specificHeatCapacity, "J/kg/K"));

        input.close();
    }
}
