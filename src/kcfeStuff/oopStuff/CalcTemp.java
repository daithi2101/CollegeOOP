/*
 * 
 * David O Connor 									10/11/2015
 * A short program to calculate temperature in celsius and farenheit.
 * 
 */
package kcfeStuff.oopStuff;

import javax.swing.*;

public class CalcTemp {

	public static void main(String[] args) {
		String input;
		int option;
		double temp = 0.0;

		input = JOptionPane.showInputDialog("Enter 1 for celsius\n2 for farenheit");
		option = Integer.parseInt(input);

		if (option == 1) {
			// Calculate celsius from farenheit.
			double tempFarenheit;

			input = JOptionPane.showInputDialog("Enter a temperature in farenheit");
			tempFarenheit = Double.parseDouble(input);

			temp = ((tempFarenheit - 32) * 5 / 9);
		} else if (option == 2){
			// Calculate farenheit from celsius.
			double tempCelsius;

			input = JOptionPane.showInputDialog("Enter a temperature in celsius");
			tempCelsius = Double.parseDouble(input);

			temp = ((tempCelsius * 9 / 5) + 32);
		}

		// format result to 4 decimal places
		String result = String.format("The result is %.4f", temp);
		// Display result
		JOptionPane.showMessageDialog(null, result);
	}

}
