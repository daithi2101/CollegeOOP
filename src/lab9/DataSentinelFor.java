package lab9;
import java.util.Scanner;
/*
 * Created by David O Connor on 21/11/2016.
 */
public class DataSentinelFor {
    public static void main(String[] args) {
        String name, longestName = "", shortestName = "";
        int atLeast17 = 0, i;

        Scanner input = new Scanner(System.in);

        for(i = 0; i <= 100000; i++){
            System.out.print("Please enter the name (hit return to exit): ");
            name = input.nextLine();

            if(name.equals(""))
                break;

            if(i == 0){
                longestName = name;
                shortestName = name;
            } else {
                if (name.length() > longestName.length())
                    longestName = name;
                else if(name.length() < shortestName.length())
                    shortestName = name;

                if(name.length() >= 17)
                    atLeast17++;
            }
        }

        if(longestName.length() == 0)
            System.out.println("\nYou entered no name at all");
        else
            System.out.println("\nThe longest name entered is " + longestName +
                    "\nThe shortest name entered is " + shortestName +
                    "\nThe percentage of name >= 17 in length is " + String.format("%.2f", ((float)atLeast17 / i) * 100));
    }
}
