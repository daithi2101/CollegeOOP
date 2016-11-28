package kcfeStuff.oopStuff;
// David O'Connor    13/12/2015
public class BooleanLogic {

	public static void main(String[] args) {
		boolean result;

		boolean isRaining = false;
		boolean isMonday = false;

		result = isRaining || isMonday;

		System.out.println(result);

		boolean studentPassed = true;
		boolean feesPaid = true;

		if (studentPassed && feesPaid) {
			System.out.println("Issue Certificate");
		}
		System.out.println(!!!studentPassed);

		char character = 'G';
		// Check to see if character is an uppercase letter
		if (character >= 'A' && character <= 'Z')
			System.out.println("Uppercase letter");

		// Check to see if character is a lowercase character
		if (character >= 'a' && character <= 'z')
			System.out.println("Lowercase letter");

		// Check if character is a letter
		if (character >= 'A' && character <= 'Z' || character >= 'a' && character <= 'z') {
			System.out.println("a letter");
		}

		// Check if character is not a letter
		if (!(character >= 'A' && character <= 'Z' || character >= 'a' && character <= 'z')) {
			System.out.println("not a letter");
		}

		int x = 5;

		if (character == 'G' && x++ > 4) {
			System.out.println("something");
		}
		System.out.println(x);
	}

}
