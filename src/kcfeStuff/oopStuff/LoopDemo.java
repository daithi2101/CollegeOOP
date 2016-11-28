// David O'Connor    13/10/2015
//A short program to demo loops ---- while loops test first, do while test at the end
package kcfeStuff.oopStuff;

public class LoopDemo {
	
	public static void main(String[] args) {
		// while loop
		int counter = 1; // Initilize
		while (counter <= 10) { // Test
			System.out.println(counter);
			counter++;// without this it would be an infinite loop //Update

		}

		// do while loop
		int counter2 = 2; // Initilize
		do {

			System.out.println(counter2);
			counter2 += 2; // Update
		} while (counter2 <= 10); // Test

		// for loop
		for (int counter3 = 1; counter3 <= 11; counter3 += 2) {
			System.out.println(counter3);
		}

		// 99 Bottles of beer
		int beerNum = 99;
		String word = "bottles";
		while (beerNum > 0) {
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer");
			System.out.println("Take one down");
			System.out.println("pass it around");
			beerNum--;

			if (beerNum == 1)
				word = "bottle";

			if (beerNum > 0)
				System.out.println(beerNum + " " + word + " of beer on the wall");

			else
				System.out.println("No more bottles of beer on the wall.");
			System.out.println();

		}
		// for each
		int[] array = { 1, 45, 2, 65, 55, 11, 32 };

		for (int number : array) {
			System.out.println(number);
		}
	}
	
}
