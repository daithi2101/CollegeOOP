package kcfeStuff.oopStuff;
// David O'Connor    13/12/2015
import javax.swing.*;

public class ClassTest {
	
	public static void main(String[] args) {
		String input;																
		int numStudents;
		double result;
		double total = 0;

		input = JOptionPane.showInputDialog("Enter number of students");		//set number of students
		numStudents = Integer.parseInt(input);

		for (int i = 1; i <= numStudents; i++) {								//run loop for each result
			input = JOptionPane.showInputDialog("Enter a result ");				//set result 
			result = Double.parseDouble(input);

			calcResult(result);													//determine each individual grade

			total += result;													//total = previous total + current result
		}

		double average = (total / numStudents);
		JOptionPane.showMessageDialog(null, "Average Result: " + average);		//display average grade
		calcResult(average);													// determine average grade
	}

	public static void calcResult(double result) {
		if (result < 50) {
			JOptionPane.showMessageDialog(null, "Grade: Unsuccessful");
		} else if (result < 65) {
			JOptionPane.showMessageDialog(null, "Grade: Pass");
		} else if (result < 80) {
			JOptionPane.showMessageDialog(null, "Grade: Merit");
		} else {
			JOptionPane.showMessageDialog(null, "Grade: Distinction");
		}
	}
	
}
