/*
 * David O'Connor							03/11/2015 
 * 
 *	A small calculator program
 */
package kcfeStuff.oopStuff;

import javax.swing.*;

public class Calculator3 {
	public static void main(String[] args) {
		double num1;
		double num2;
		int option;
		String input;

		input = JOptionPane.showInputDialog("Enter first number");
		num1 = Double.parseDouble(input);

		input = JOptionPane.showInputDialog("Enter second number");
		num2 = Double.parseDouble(input);

		input = JOptionPane.showInputDialog("1 = Add, 2 = Sub, 3 = Mul, 4= Div");
		option = Integer.parseInt(input);

		// Process Inputs based on option entered

		if (option == 1) {
			JOptionPane.showMessageDialog(null, num1 + num2);
		} else if (option == 2) {
			JOptionPane.showMessageDialog(null, num1 - num2);
		} else if (option == 3) {
			JOptionPane.showMessageDialog(null, num1 * num2);
		} else {
			JOptionPane.showMessageDialog(null, num1 / num2);
		}
	}

}
