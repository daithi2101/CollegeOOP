package lab4;
import java.util.Scanner;

/*
 * Created by David O Connor on 03/10/2016.
 */
public class Exercise1 {
    public static void main(String args[]) {
        int age;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        age = input.nextInt();

        if (age < 20) {
            System.out.print("You are under 20 years old");
        } else {
            System.out.print("You are over 20 years old");
        }

        input.close();
    }
}
