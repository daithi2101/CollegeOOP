package lab6;
import java.util.Scanner;
//Exercise1.java        David O Connor
/*
 Program to convert temperature from Fahrenheit to Celsius using a
 data-sentinel controlled while loop
 */
public class Exercise1 {
    public static void main(String[] args) {
        int numOfConversions = 0, atOrOver20C = 0, exceeding30C = 0, below10C = 0;
        float tempFahrenheit, totalTempCelsius = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first Fahrenheit temperature " +
                "(below -459.67 to exit): ");
        tempFahrenheit = input.nextFloat();

        while(tempFahrenheit >= -459.67) {
            float tempCelsius = (5f * (tempFahrenheit - 32f)) / 9f;
            System.out.print("The equivalent Celsius temperature is " + String.format("%.3f", tempCelsius));

            numOfConversions++;
            totalTempCelsius+= tempCelsius;

            if(tempCelsius > 30)
                exceeding30C++;

            if(tempCelsius >= 20)
                atOrOver20C++;

            if(tempCelsius < 10)
                below10C++;

            System.out.print("\n\nPlease enter another Fahrenheit temperature " + "(below -459.67 to exit): ");
            tempFahrenheit = input.nextFloat();
        }

        if(numOfConversions != 0) {
            System.out.println("\n==============================\n\t\tProgram Results" + "\n==============================" + "\nTotal conversions performed: " + numOfConversions + "\nAverage Celsius temperature: "
                    + String.format("%.3f", totalTempCelsius / numOfConversions) + "\nTotal Celsius temperatures > 30C: " + exceeding30C + "\nTotal Celsius temperatures < 10C: " + below10C + "\nPercentage Celsius temperatures >= 20C: "
                    + String.format("%.0f", atOrOver20C * 100f / numOfConversions) + "%");

        }else
            System.out.println("\nNo conversions were performed....Goodbye");
    }
}
