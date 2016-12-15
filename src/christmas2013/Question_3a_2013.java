package christmas2013;

import java.util.Scanner;

/*
 * Created by Dave on 15-Dec-16.
 */
public class Question_3a_2013 {
    public static void main(String[] args) {
        int count = 0, above70 = 0;
        float weight, smallestWeight = 0, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please ... person " + (count + 1) + " (-1 to exit): ");
        weight = input.nextFloat();

        while (weight != -1){
            if(count == 0)
                smallestWeight = weight;
            else if(weight < smallestWeight)
                smallestWeight = weight;

            if(weight > 70)
                above70++;
            total += weight;
            count++;

            System.out.print("Please ... person " + (count + 1) + " (-1 to exit): ");
            weight = input.nextFloat();
        }

        System.out.println("\nNumber of weight values entered: " + count +
        "\nNumber of weight values exceeding 70kg: " + above70 +
        "\nSmallest weight value entered: " + smallestWeight + "kg" +
        "\nAverage of weight values: " + String.format("%.2f", (total/(float)count)) + "kg");
    }
}
