package lab8;
import java.util.Scanner;
/*
 * Created by David O Connor on 14/11/2016.
 */
public class DoWhile2 {
    public static void main(String[] args) {
        String menuText = "\n\n\t1.Convert Fahrenheit to Celsius\n\t2. Convert Celsius to Fahrenheit\n\t3. Quit" +
                "\n\nPlease enter your choice: ";
        int choice;
        float celsius, fahrenheit;

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

                    while((celsius < -273)) {
                        System.out.print("\nInvalid temperature - must be above -273. Please re-enter: ");
                        celsius = input.nextFloat();
                    }
                    fahrenheit = (9 / 5f) * celsius + 32;

                    System.out.println(celsius + "C is equivalent to " + String.format("%.2f", fahrenheit) + "F");
                    break;
                case 3:
                    System.out.println("Thanks for using the system .... goodbye");
            }
        }while(choice != 3);

        input.close();
    }
}
