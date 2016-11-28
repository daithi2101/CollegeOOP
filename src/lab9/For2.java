package lab9;
import java.util.Scanner;
/*
 * Created by David O Connor on 21/11/2016.
 */
public class For2 {
    public static void main(String[] args) {
        String headerFormatString = String.format("%-15s%-15s%-15s%-15s\n%-15s%-15s%-15s%-15s\n", "Number",
                "Square Root", "Log10", "Ln", "======", "===========", "====", "==");

        Scanner input = new Scanner(System.in);

        System.out.println(headerFormatString);

        for(int i = 1; i <= 90; i++) {
            String lineFormatString = String.format("%-15d%-15.5f%-15.5f%-15.5f", i, Math.sqrt(i), Math.log10(i),
                    Math.log(i));
            System.out.println(lineFormatString);

            if(i % 15 == 0 && i != 90) {
                System.out.print("Hit return to see the next chunk of output...");
                input.nextLine();
                System.out.println("\n\n\n\n\n\n" + headerFormatString);
            }
        }
    }
}
