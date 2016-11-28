package lab9;
import java.util.Scanner;
/*
 * Created by David O Connor on 21/11/2016.
 */
public class Exercise2 {
    public static void main(String[] args) {
        int total = 0, upperLimit;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter upper limit: ");
        upperLimit = input.nextInt();

        for(int i = 0; i <= upperLimit; i++) {
            total += i;
        }
        System.out.println("The sum of the first " + upperLimit + " positive integers is " + total);
    }
}
