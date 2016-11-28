package lab6;
import java.util.Scanner;
//DataSentinelWhile3.java        David O Connor
/*
 Program to determine the nature of every character of a sentence using a while loop be
 it uppercase, lowercase, digit or punctuation
 */
public class DataSentinelWhile3 {
    public static void main(String[] args) {
        String sentence;
        char ch;
        int index = 0, lowerLetters = 0, upperLetters = 0, digits = 0, punctuation = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter any sentence you like (terminated by a full-stop): \n");
        sentence = input.nextLine();
        ch = sentence.charAt(index);

        while(ch != '.') {
            if(ch >= 'a' && ch <= 'z')
                lowerLetters++;
            else if(ch >= 'A' && ch <= 'Z')
                upperLetters++;
            else if(ch >= '0' && ch <= '9')
                digits++;
            else
                punctuation++;

            index++;
            ch = sentence.charAt(index);
        }

        System.out.println("\n\n*******Lexical Analysis of Your Sentence*******" + "\nLowercase letters: " + lowerLetters + "\nUppercase letters: " + upperLetters + "\nDigits: " + digits + "\nPunctuation symbols: " + (punctuation +1));

        input.close();
    }
}
