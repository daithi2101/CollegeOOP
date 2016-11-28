//David O'Connor       20/10/2015
//Calculate the area of a room
package kcfeStuff.oopStuff;

import javax.swing.*;

public class AreaofRoom {

	public static void main(String[] args) {
		String roomLength;
		String roomWidth;
		double length;
		double width;

		roomLength = JOptionPane.showInputDialog("Hello, what is the length of the room");
		roomWidth = JOptionPane.showInputDialog("Hello, what is the width of the room");
		length = Double.parseDouble(roomLength);// converting string to a double
		width = Double.parseDouble(roomWidth);
		String roomArea = String.format("The Area of the room is: %.3f", length * width);

		JOptionPane.showMessageDialog(null, roomArea);
	}

}
