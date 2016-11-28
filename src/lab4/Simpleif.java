package lab4;
import java.util.Scanner;
/*
 * Created by David O Connor on 03/10/2016.
 */
public class Simpleif {
    public static void main(String args[]){
        String answerAsString;
        char answer;

        Scanner input = new Scanner(System.in);

        System.out.print("Do you like Java (y/n)? ");
        answerAsString = input.nextLine();

        answer = answerAsString.charAt(0);

        if(answer == 'y') {
            System.out.println("\nYou said you like Java");
        }
        if(answer == 'n') {
            System.out.println("\nYou said you dislike Java");
        }

        input.close();
    }
}
