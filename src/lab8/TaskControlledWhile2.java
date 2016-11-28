package lab8;
import java.util.Scanner;
/*
 * Created by David O Connor on 14/11/2016.
 */
public class TaskControlledWhile2 {
    public static void main(String[] args) {
        float rate, balance = 1000;
        int year = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the interest rate: ");
        rate = input.nextFloat();

        System.out.println("\n\n");

        while(balance <= 2000) {
            balance += (balance * rate) / 100;
            System.out.println("Balance at end of year " + year + " is EUR" + String.format("%.2f", balance));
            year++;
        }

        input.close();
    }
}
