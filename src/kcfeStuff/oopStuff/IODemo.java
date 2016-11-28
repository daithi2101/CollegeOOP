// David O'Connor                             		19/10/2015
// A short program to demo dialog boxes for input and output.
package kcfeStuff.oopStuff;

import javax.swing.*;

public class IODemo {
	
	public static void main(String[] args) {
		String name;
		String inputtedAge;
		int age;
		name = JOptionPane.showInputDialog("Hello, what is your name");
		JOptionPane.showMessageDialog(null, "Hi " + name);
		inputtedAge = JOptionPane.showInputDialog("How old are you?");

		// Convert from String/Text format to number format
		age = Integer.parseInt(inputtedAge);
		JOptionPane.showMessageDialog(null, "You are " + age * 7 + " in dog years.");

		// Formatted Output
		JOptionPane.showMessageDialog(null, "The value of pi is " + Math.PI);
		String pi;

		pi = String.format("The value of pi is %f", Math.PI);
		JOptionPane.showMessageDialog(null, pi);

		pi = String.format("The value of pi is %10.3f", Math.PI);
		JOptionPane.showMessageDialog(null, pi);

		pi = String.format("The value of pi is %.3f", Math.PI);
		JOptionPane.showMessageDialog(null, pi);

		pi = String.format("The value of pi is %.13f", Math.PI);
		JOptionPane.showMessageDialog(null, pi);

		pi = String.format("The value of pi is %.30f", Math.PI);
		JOptionPane.showMessageDialog(null, pi);

		pi = String.format("This is our %d value of pi which is %.3f", 6, Math.PI);
		JOptionPane.showMessageDialog(null, pi);
	}
	
}
