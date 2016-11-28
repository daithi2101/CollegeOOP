package kcfeStuff.oopStuff;
// David O'Connor    13/10/2015
import java.util.Scanner;

public class GuessGame {
	
	public static void main(String[] args) {
		int randomNumber;
		int guess;
		Scanner in = new Scanner(System.in);
		// Create a random number between 1 and 20 inclusive
		randomNumber = (int) (Math.random() * 100) + 1;
		do {
			System.out.println("Enter a number: ");
			guess = in.nextInt();
			if (guess > randomNumber)
				System.out.println("Lower");
			else if (guess < randomNumber)
				System.out.println("Higher");
		} while (guess != randomNumber);
		// Winner
		System.out.println("Well Done!!!");
		in.close();
	}
	
}
