/*
 * David O'Connor							09/11/2015
 * 
 * A program to calculate the area of some shapes
 * 
 */
package kcfeStuff.oopStuff;

import javax.swing.*;

public class AreaCalculator2 {

	public static void main(String[] args) {
		int choice;
		String input;
		double area = 0.0;

		input = JOptionPane.showInputDialog("Enter 1 for Rectangle\n2 for Triangle\n3 for Circle");
		choice = Integer.parseInt(input);

		if (choice == 1) {
			// Calculate the area of a rectangle
			double height;
			double width;
			input = JOptionPane.showInputDialog("Enter a height");
			height = Double.parseDouble(input);
			input = JOptionPane.showInputDialog("Enter a width");
			width = Double.parseDouble(input);
			area = height * width;
		} else if (choice == 2) {
			// Calculate the area of a triangle
			double height;
			double width;
			input = JOptionPane.showInputDialog("Enter a height");
			height = Double.parseDouble(input);
			input = JOptionPane.showInputDialog("Enter a width");
			width = Double.parseDouble(input);
			area = 0.5 * height * width;
		} else if (choice == 3) {
			// Calculate the area of a circle
			double radius;
			input = JOptionPane.showInputDialog("Enter a radius");
			radius = Double.parseDouble(input);
			area = Math.PI * radius * radius;
		}
		String answer = String.format("The area is %.3f", area);
		JOptionPane.showMessageDialog(null, answer);
	}

}
