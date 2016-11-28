// David O'Connor                       28/09/2014
// A short program to demo the use of variables
package kcfeStuff.oopStuff;

public class VariableDemo {

	public static void main(String[] args) {
		int age; // creates a location in memory, named age
		age = 18;
		System.out.println(age);
		age = 20;
		System.out.println(age);
		System.out.println("age");

		double price = 4.99;
		System.out.println(price);

		boolean inStock = true;
		char sex = 'M';
		byte value = 66;

		int num1 = 50;
		int num2 = 20;

		System.out.println(num1 + num2); // add
		System.out.println(num1 - num2); // sub
		System.out.println(num1 * num2); // mul
		System.out.println(num1 / num2); // div
		System.out.println(num1 % num2); // remainder

		int index = 0;
		index = index + 1; // adding 1 to the value in index
		index += 1; // adding 1 to the value in index
		index++; // adding 1 to the value in index
		System.out.println(index);

		// Post inc
		System.out.println(index++);
		System.out.println(index);

		// Pre Inc
		System.out.println(++index);
		System.out.println(index);

		index = index - 1;
		index -= 1;
		index--;
		System.out.println(index);

		System.out.println(index--);
		System.out.println(index);

		System.out.println(--index);
		System.out.println(index);

		byte b1 = 20;
		byte b2 = 25;
		int b3 = b1 + b2;

		int i1 = 50;
		double d1 = 20.5;
		double d2 = i1 + d1;
	}
	
}
