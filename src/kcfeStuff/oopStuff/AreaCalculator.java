//David O'Connor						20/10/2015
//A program to calculate the area of a room.
package kcfeStuff.oopStuff;

import javax.swing.*;

public class AreaCalculator {

	public static void main(String[] args) {
		double width;
		double length;
		String inputtedValue;
		
		inputtedValue = JOptionPane.showInputDialog("Enter the width of the room");
		width = Double.parseDouble(inputtedValue);
		
		inputtedValue = JOptionPane.showInputDialog("Enter the length of the room");
		length = Double.parseDouble(inputtedValue);
		
		// Area of a rectangle is width * length
		String areaOutput = String.format("The area of the room is %.3f",
				width * length);
		
		JOptionPane.showMessageDialog(null, areaOutput);
	}

}
