package kcfeStuff.oopStuff;
// David O'Connor    21/12/2015
public class ConvertingDemo {
	
	public static void main(String[] args) {
		System.out.println("123" + "45");
		System.out.println(123 + "45");
		System.out.println("123" + 45);
		System.out.println(123 + 45);

		// From String to number
		int i1 = Integer.parseInt("123");
		String s1 = "45";
		int i2 = Integer.parseInt(s1);
		System.out.println(i1 + i2);

		int i3 = Integer.parseInt("123");
		double d1 = Double.parseDouble("3.141596");

		System.out.println(i3);
		System.out.println(d1);

		System.out.println("---------------------------------");
		// From number to String

		int i4 = 12564;
		String s2 = i4 + ""; // 12564 + "" -> "12564"

		String s3 = String.valueOf(i4);
		String s4 = Integer.toString(i4);

		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		// Getting a character from a String
		char firstLetter;
		String letters = "ABCDEFG";
		firstLetter = letters.charAt(0);
		System.out.println(firstLetter);
	}
	
}
