package christmas2014;
import java.util.Scanner;
/*
 * Created by David O Connor on 28/11/2016.
 */
public class Question2b2014 {
    public static void main(String[] args) {
        String sentence;
        String choice;
        char ch;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        sentence = input.nextLine();

        System.out.println("\n\t\t\tA. Display First Character\n\t\t\tB. Is First Character a Lowercase Letter?" +
                "\n\t\t\tC. Display Sentence Length");

        System.out.print("\nPlease enter your choice: ");
        choice = input.nextLine();
        ch = choice.toUpperCase().charAt(0);

        switch(ch) {
            case 'A':
                System.out.println("\nFirst character of the sentence is " + sentence.charAt(0));
                break;
            case 'B':
                if(sentence.charAt(0) >= 'a' && sentence.charAt(0) <= 'z')
                    System.out.println("\nFirst character is a lowercase letter");
                else
                    System.out.println("\nFirst character is not a lowercase letter");
                break;
            case 'C':
                System.out.println("\nLength of the sentence is " + sentence.length());
                break;
        }

        input.close();
    }
}
