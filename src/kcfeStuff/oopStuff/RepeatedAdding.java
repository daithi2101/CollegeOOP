package kcfeStuff.oopStuff;
// David O'Connor    18/10/2015
import javax.swing.*;

public class RepeatedAdding {
	
	public static void main(String[] args) {

		double num1;
		double num2;
		char option;
		String input;

		do {
			input = JOptionPane.showInputDialog("Enter a number");
			num1 = Double.parseDouble(input);

			input = JOptionPane.showInputDialog("Enter another number");
			num2 = Double.parseDouble(input);

			JOptionPane.showMessageDialog(null, "sum = " + (num1 + num2));

			input = JOptionPane.showInputDialog("Do you want to add two more numbers");
			option = input.toLowerCase().charAt(0);
		} while (option == 'y');
	}
	
}

