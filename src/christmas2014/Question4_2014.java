package christmas2014;
import java.util.Scanner;
/*
 * Created by David O Connor on 29/11/2016.
 */
public class Question4_2014 {
    public static void main(String[] args) {
        String registration;
        int count = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Loop " + (count + 1) + " - Please enter a registration plate: ");
            registration = input.nextLine();

            int i = 0;

            while(i < 2) {
                char ch = registration.charAt(i);
                if (!(ch >= '1' && ch <= '9')) {
                    System.out.println("\nThe first part of the reg plate is wrong - must be two digits");
                    break;
                }else
                    i++;
            }

            while(i == 2) {
                char ch = registration.charAt(i);
                if (ch != '-') {
                    System.out.println("\nThe second part of the reg plate is wrong - must be a dash");
                    break;
                }else
                    i++;
            }

            while(i > 2 && i < 5) {
                char ch = registration.charAt(i);
                if (!(ch >= 'A' && ch <= 'Z')){
                    System.out.println("\nThe third part of the reg plate is wrong - must be two uppercase letters");
                    break;
                }
                else
                    i++;
            }

            while(i == 5) {
                char ch = registration.charAt(i);
                if (ch != '-'){
                    System.out.println("\nThe fourth part of the reg plate is wrong - must be a dash");
                    break;
                }
                else
                    i++;
            }
            while(i > 5 && i < registration.length()) {
                char ch = registration.charAt(i);
                if(!(ch >= '1' && ch <= '9')) {
                    System.out.println("\nThe fifth part of the reg is wrong - must all digits");
                    break;
                }else
                    i++;
            }

            while(i == registration.length()) {
                System.out.println("\nThe registration plate is valid");
                i++;
            }

            count++;

        }while(count < 6);

        input.close();
    }
}
