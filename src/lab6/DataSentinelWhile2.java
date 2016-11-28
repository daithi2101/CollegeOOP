package lab6;
import java.util.Scanner;
//DataSentinelWhile2.java           David O Connor
/*
 Program designed to mimic a simple cash register using data-sentinel controlled
 while loops
 */
public class DataSentinelWhile2 {
    public static void main(String[] args) {
        float price, totalPrice = 0;
        int numProducts = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the price of product " + (numProducts + 1) + " (-1 to exit): ");
        price = input.nextFloat();

        while(price != -1) {
            totalPrice += price;
            numProducts++;

            System.out.print("Please enter the price of product " + (numProducts + 1) + " (-1 to exit): ");
            price = input.nextFloat();
        }

        System.out.println("\nTotal products entered: " + numProducts + "\nTotal Price:" + " EUR" + String.format("%.2f", totalPrice));
    }
}
