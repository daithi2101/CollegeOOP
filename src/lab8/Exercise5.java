package lab8;

import java.util.Scanner;
/*
 * Created by David o Connor on 14/11/2016.
 */
public class Exercise5 {
    public static void main(String[] args) {
        String menuText = "\n\n\t1. Convert Fahrenheit to Celsius\n\t2. Convert Celsius to Fahrenheit" +
                "\n\t3. Convert Kelvin to Celsius\n\t4. Quit\n\nPlease enter your choice: ";
        int choice;
        float celsius, fahrenheit, kelvin;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print(menuText);
            choice = input.nextInt();

            switch(choice){
                case 1:
                    System.out.print("\nPlease enter a temperature in Fahrenheit: ");
                    fahrenheit = input.nextFloat();

                    celsius = (fahrenheit - 32) * (5f / 9);

                    System.out.println(fahrenheit + "F is equivalent to " + String.format("%.2f" , celsius) + "C");
                    break;
                case 2:
                    System.out.print("\nPlease enter a temperature in Celsius: ");
                    celsius = input.nextFloat();

                    fahrenheit = (9 / 5f) * celsius + 32;

                    System.out.println(celsius + "C is equivalent to " + String.format("%.2f", fahrenheit) + "F");
                    break;
                case 3:
                    System.out.println("\nPlease enter a temperature in Kelvin: ");
                    kelvin = input.nextFloat();

                    celsius = kelvin - 273;

                    System.out.println(kelvin + "K is equivalent to " + String.format("%.2f", celsius) +"C");
                    break;
                case 4:
                    System.out.println("Thanks for using system .... goodbye");

            }
        }while(choice != 4);

        input.close();
    }
}
