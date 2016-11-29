package christmas2014;
import java.util.Scanner;
/*
 * Created by David O Connor on 28/11/2016.
 */
public class Question3b2014 {
    public static void main(String[] args) {
        String word, character;
        char ch;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        word = input.nextLine();

        System.out.print("Please enter the character you seek: ");
        character = input.nextLine();
        ch = character.charAt(0);

        while(count < word.length()) {
            if(word.charAt(count) == ch) {
                System.out.println("\nThe first location of '" + ch + "' in \"" + word + "\" is " +
                        (count + 1));
                break;
            }
            else
                count++;
        }
        if(count == word.length())
            System.out.println("\nThe character '" + ch + "' does not appear in \"" + word + "\"");

        input.close();
    }
}
