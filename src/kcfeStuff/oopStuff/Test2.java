package kcfeStuff.oopStuff;
// David O'Connor    21/01/2015
import javax.swing.*;

public class Test2 {

	public static void main(String[] args) {
		int numStudents;
		String input;
		double result;
		double total = 0;

		input = JOptionPane.showInputDialog("Enter number of students");
		numStudents = Integer.parseInt(input);

		for (int i = 1; i <= numStudents; i++) {
			input = JOptionPane.showInputDialog("Enter a result");
			result = Double.parseDouble(input);
			total += result;
		}

		System.out.println();
		double average = (total / numStudents);
		JOptionPane.showMessageDialog(null, "Average grade: " + average);
		calcResult(average);
	}

	public static void calcResult(double result) {
		if (result < 50) {
			JOptionPane.showMessageDialog(null, "Grade: Fail");
		} else if (result < 65) {
			JOptionPane.showMessageDialog(null, "Grade: Pass");
		} else if (result < 85) {
			JOptionPane.showMessageDialog(null, "Grade: Merit");
		} else {
			JOptionPane.showMessageDialog(null, "Grade: Distinction");
		}
	}

}