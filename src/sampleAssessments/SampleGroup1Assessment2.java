package sampleAssessments;
import java.util.Scanner;
/*
 * Created by David O Connor on 21/11/2016.
 */
public class SampleGroup1Assessment2 {
    public static void main(String[] args) {
        float height, smallestHeight = 0f, totalHeight = 0f;
        int numValidHeights = 0, between1300And1900cm = 0, aboveGlobalAverage = 0;
        final float LOWEST_EVER_HEIGHT = .5464f, HIGHEST_EVER_HEIGHT = 2.72f, GLOBAL_AVERAGE_HEIGHT = 1.665f;

        Scanner input = new Scanner(System.in);

        while(numValidHeights < 6){
            System.out.print("Loop " + (numValidHeights + 1) + " - Please enter height: ");
            height = input.nextFloat();

            while(!(height >= LOWEST_EVER_HEIGHT && height <= HIGHEST_EVER_HEIGHT)) {
                System.out.print("Loop " + (numValidHeights + 1) + " - Height value invalid!!! Please re-enter height: ");
                height = input.nextFloat();
            }

            totalHeight += height;

            if(numValidHeights == 0)
                smallestHeight = height;
            else{
                if(height < smallestHeight)
                    smallestHeight = height;
            }

            if(height >= 1.3 && height <= 1.9)
                between1300And1900cm++;

            if(height > GLOBAL_AVERAGE_HEIGHT)
                aboveGlobalAverage++;

            System.out.println();

            numValidHeights++;
        }
        if(numValidHeights == 6)
            System.out.print("----------------------------------" + "\n\t\tHeight Statistics" +
                    "\n----------------------------------" + "\nThe average of the heights entered is " +
                    String.format("%.1f",(totalHeight / numValidHeights)) + "m" +
                    "\nThe smallest height value entered is " + smallestHeight + "m" +
                    "\nThe number of height values between 1.3m and 1.9m inclusive is " + between1300And1900cm +
                    "\nThe percentage of height values exceeding the global average height is " +
                    String.format("%.2f", (((float)aboveGlobalAverage / (float)numValidHeights) * 100f)) + "%");

    }
}
