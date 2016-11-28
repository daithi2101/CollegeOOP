/*
 *  David O'Connor						02/11/2015
 * 
 *  A short program using dialog boxes to calculate the 
 *  sum, difference, product and quotient of two numbers
 *  
 */
package kcfeStuff.oopStuff;

import javax.swing.*;

public class Calculator {

	public static void main(String[] args) {
		String name;
		double number1, number2;
		String input;

		name = JOptionPane.showInputDialog("What is your name");

		// Prompt for first number
		input = JOptionPane.showInputDialog("Enter first number");
		number1 = Double.parseDouble(input);

		// Prompt for second number
		input = JOptionPane.showInputDialog("Enter second number");
		number2 = Double.parseDouble(input);

		// number2 = Double.parseDouble(JOptionPane.showInputDialog("Enter
		// second number"));

		// Output the sum of the two numbers
		JOptionPane.showMessageDialog(null, "Sum = " + (number1 + number2));

		// Output the difference of the two numbers
		JOptionPane.showMessageDialog(null, "Difference = " + (number1 - number2));

		// Output the product of the two numbers
		JOptionPane.showMessageDialog(null, "Product = " + (number1 * number2));

		// Output the quotient of the two numbers
		JOptionPane.showMessageDialog(null, "Quotient = " + (number1 / number2));

		String output;
		output = String.format("Quotient = %.4f", number1 / number2);
		JOptionPane.showMessageDialog(null, output);
	}

}
