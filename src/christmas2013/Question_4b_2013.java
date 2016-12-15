package christmas2013;

import java.util.Scanner;

/*
 * Created by Dave on 15-Dec-16.
 */
public class Question_4b_2013 {
    public static void main(String[] args) {
        int number;
        String factors = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        number = input.nextInt();

        for(int i = 1; i <= number; i++) {
            if(number % i == 0)
                factors += (i + " ");
        }
        System.out.printf("\n\nThe factors of 40 are " + factors);
    }
}
