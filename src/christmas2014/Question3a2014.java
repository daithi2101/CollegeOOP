package christmas2014;
import java.util.Scanner;
/*
 * Created by David O Connor on 29/11/2016.
 */
public class Question3a2014 {
    public static void main(String[] args) {
        int count = 0, age, numOfTeenagers = 0, largestAge = 0, numAboveAverage = 0;
        final float AVERAGE_LIFE_EXPECTANCY = 80.9f;

        Scanner input = new Scanner(System.in);

        while(count < 10) {
            System.out.print("Please enter the age of person " + (count + 1) + ": ");
            age = input.nextInt();

            if(age >= 13 && age <= 19)
                numOfTeenagers++;

            if(count == 0)
                largestAge = age;
            else if(age > largestAge)
                largestAge = age;

            if(age > AVERAGE_LIFE_EXPECTANCY)
                numAboveAverage++;

            count++;
        }
        System.out.println("\nNumber of teenagers: " + numOfTeenagers + "\nLargest age: " + largestAge +
                " years\nPercent above average life expectancy: " + String.format("%.0f", (((float)numAboveAverage /
                (float)count) * 100)) + "%");
    }
}
