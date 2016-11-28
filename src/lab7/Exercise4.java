package lab7;
import java.util.Scanner;
/*
 * David O Connor        07/11/2016.
 * Program to determine if a String is a positive whole number
 */
public class Exercise4 {
    public static void main(String[] args) {
        String text;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a piece of text: ");
        text = input.nextLine();

        while(count < text.length()) {
            if(text.charAt(count) >= '0' && text.charAt(count) <= '9')
                count++;
            else{
                System.out.println("\n You did not enter a positive whole number");
                break;
            }
        }
        if(count == text.length())
            System.out.println("\n You entered a positive whole number");

        input.close();
    }
}
