package lab7;
import java.util.Scanner;
/*
 * David O Connor           07/11/2016
 * Simple program to determine avg weight of 5 people and % over 80kg using counter controlled while loop
 */
public class Exercise1 {
    public static void main(String[] args) {
        double weight, totalWeight = 0, averageWeight, percentageOver80 = 0;
        int index = 0;

        Scanner input = new Scanner(System.in);

        while(index < 5){
            System.out.print("Please enter the weight of person " + (index + 1) + ": ");
            weight = input.nextDouble();

            if(weight > 80)
                percentageOver80++;

            totalWeight += weight;

            index++;
        }

        averageWeight = totalWeight / 5;

        System.out.println("\n\n================================" +
                "\n\tProgram Results" +
                "\n================================" +
                "\n\nAverage weight: "+ String.format("%.2f", averageWeight) + "kg" +
                "\nPercentage >= 80kg: " + String.format("%.2f", (percentageOver80 / 5 * 100)) + "%");
    }
}
