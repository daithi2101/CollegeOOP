package lab5;
import java.util.Scanner;

/*
 * Created by David on 08/10/2016.
 */
public class Exercise2 {
    public static void main(String args[]) {
        String testCharacter;
        char character;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a keyboard character: ");
        testCharacter = input.nextLine();
        character = testCharacter.charAt(0);

        if(character >= '0' && character <= '9') {
            System.out.print("You entered a digit");
        } else if(character >= 'a' && character <= 'z'){
            System.out.print("You entered a lowercase letter");
        } else if(character >= 'A' && character <= 'Z') {
            System.out.print("You entered a uppercase letter");
        } else {
            System.out.print("\nYou entered neither a letter nor a digit");
        }

        input.close();
    }
}