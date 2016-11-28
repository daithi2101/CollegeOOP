package sampleAssessments;
import java.util.Calendar;
import java.util.Scanner;
/*
 * Created by David O Connor on 21/11/2016.
 */
public class SampleGroup3Assesment2 {
    public static void main(String[] args) {
        int index = 0, totalSpaces = 0, totalWords = totalSpaces + index;
        String text, smallestText = "";

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please enter piece of text " + (index + 1) + ": ");
            text = input.nextLine();

            int lowerVowels = 0, words = 0, ed = 0, spaces = 0;

            if(index == 0)
                smallestText = text;
            else if(text.length() < smallestText.length())
                smallestText = text;

            int count = 0;

            int totalChars = text.length();

            while(count < text.length()) {
                if (text.charAt(count) == 'a' || text.charAt(count) == 'e' || text.charAt(count) == 'i' ||
                        text.charAt(count) == 'o' || text.charAt(count) == 'u')
                    lowerVowels++;

                if (text.charAt(count) == ' ') {
                    spaces++;
                    totalSpaces++;
                }

                words = spaces + 1;

                if (text.charAt(count) == 'd' && text.charAt(count - 1) == 'e')
                    ed++;

                count++;
            }
            System.out.println("\n\t\t\t******Text Data******" +
                    "\n\nNumber of characters: " + totalChars +
                    "\nNumber of lowercase vowels: " + lowerVowels +
                    "\nNumber of words: " + words +
                    "\nNumber of times \"ed\" appears in the text: " + ed +"\n");

            index++;
        }while(index < 3);

        System.out.println("\n\n******Overall Results******" +
                "\n\nShortest piece of text: " + smallestText +
                "\nAverage number of words: " + (totalWords / index));

        input.close();
    }
}
