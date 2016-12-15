package christmas2013;

import java.util.Scanner;

/*
 * Created by Dave on 15-Dec-16.
 */
public class Question_4a_2013 {
    public static void main(String[] args) {
        String country, longestName = "", beginWithA = "";
        int over10 = 0, count = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please ... country " + (count + 1) + " : ");
            country = input.nextLine();

            if(country.charAt(0) == 'A')
                beginWithA += (country + " ");

            if(count == 0)
                longestName = country;
            else if(country.length() > longestName.length())
                longestName = country;

            if(country.length() > 10)
                over10++;

            count++;
        }while(count < 10);

        System.out.println("\n\nThe country .. longest name is " + longestName +
                "\nThe names ... begin with 'A' are " + beginWithA + "\n\nThe percentage ... 10 characters is " +
                String.format("%.0f",(((float)over10/(float)count) * 100f)) + "%");
    }
}
