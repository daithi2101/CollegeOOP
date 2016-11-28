package lab9;
import java.util.Scanner;
/*
 * Created by David O Connor on 21/11/2016.
 */
public class Exercise4 {
    public static void main(String[] args) {
        String text;
        int i;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a piece of text: ");
        text = input.nextLine();

        for(i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if(!(ch >= '0' && ch <= '1')) {
                System.out.println("\nYou did not enter a binary number");
                break;
            }
        }
        if(i == text.length())
            System.out.println("\nYou entered a binary number");
    }
}
