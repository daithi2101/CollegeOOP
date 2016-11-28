package lab7;
import java.util.Scanner;
/*
 * David O Connor           07/11/2016
 * Simple program using the counter controlled while loop to determine names starting with an 'A'
 * and names with over 20 letters
 */
public class CounterControlledWhile {
        public static void main(String[] args) {
            String name, namesOver20 = "", nameStartingWithA = "";
            int totalLength = 0, count = 0;

            Scanner input = new Scanner(System.in);

            while(count < 10) {
                System.out.print("Please enter the name of the person " + (count + 1) + ": ");
                name = input.nextLine();

                if(name.length() > 20)
                    namesOver20 += name + "\n";

                totalLength += name.length();

                if(name.charAt(0) == 'A')
                    nameStartingWithA += name + "\n";

                count++;
            }

            System.out.println("\n\n===============================" +
                    "\n\tProgram Results" +
                    "\n===============================" +
                    "\n\nList of names containing > 20 characters: \n"+ namesOver20 +
                    "\n\nList of names begging with an 'A': \n" + nameStartingWithA +
                    "\nAverage length of the names: " + String.format("%.0f", totalLength/10f));
        }
}
