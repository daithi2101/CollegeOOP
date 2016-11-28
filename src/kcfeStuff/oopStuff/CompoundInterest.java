package kcfeStuff.oopStuff;
// David O'Connor    10/12/2015
import javax.swing.JOptionPane;

public class CompoundInterest {
	
	public static void main(String[] args) {

		String input;
		double principal, interestRate;
		int time;

		input = JOptionPane.showInputDialog("Enter initial principle");
		principal = Double.parseDouble(input);

		input = JOptionPane.showInputDialog("Enter number of years");
		time = Integer.parseInt(input);

		input = JOptionPane.showInputDialog("Enter interest rate");
		interestRate = Double.parseDouble(input);

		for (int i = 1; i <= time; i++) {
			String output = String.format("Amount after year " + i + " is �%.2f",
					principal += (principal / 100 * interestRate));
			JOptionPane.showMessageDialog(null, output);
			if (i == time) {
				String finalAmount = String.format("Final amount is �%.2f", principal);
				JOptionPane.showMessageDialog(null, finalAmount);
			}
		}
	}
	
}