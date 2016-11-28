package lab7;
import java.util.Scanner;
/*
 * David O Connor           07/11/2016
 * Simple program that gives 3 attempts to enter pre-determined username and password using a counter-controlled while
 * loop
 */
public class Exercise2 {
    public static void main(String[] args) {
        String username, password;
        int count = 0;

        Scanner input = new Scanner(System.in);

        while(count < 3) {
            System.out.print("Please enter the username: ");
            username = input.nextLine();

            System.out.print("Please enter the password: ");
            password = input.nextLine();

            if(username.equals("t00012345") && password.equals("java")) {
                System.out.print("\nWelcome to the system!");
                break;
            } else {
                if(count < 2)
                    System.out.println("\nInvalid username/password combination. " + (2 - count) + " attempts " +
                            "remaining\n");

                count++;
            }

        }
        if(count == 3)
            System.out.println("\nInvalid username/password combination. IP address noted. Banned for 24 hours");

        input.close();
    }
}
