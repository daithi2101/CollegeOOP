/*
 * 
 * David O Connor 					15/11/2015
 * Exercise in for loops
 * 
 */
package kcfeStuff.oopStuff;

public class Exercise {

	public static void main(String[] args) {
		// 1 to 100
		for (int i = 1; i <= 100; ++i) {
			System.out.printf("%02d ", i);
			if (i % 10 == 0) {
				System.out.printf("%n");
			}
		}
		// 100 to 1
		for (int i = 100; i >= 1; --i) {
			System.out.printf("%02d ", i);
			if (i % 10 == 0 && i != 100) {
				System.out.printf("%n");
			}
		}
	}
	
}
