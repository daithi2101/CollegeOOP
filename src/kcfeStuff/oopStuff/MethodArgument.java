package kcfeStuff.oopStuff;
// David O'Connor    11/02/2015
public class MethodArgument {

	public static void main(String[] args) {
		Cat felix = new Cat();
		felix.name = "Felix";

		Cat puss = new Cat();
		puss.name = "Puss in Boots";

		System.out.println(felix.name);
		System.out.println(puss.name);

		System.out.println();// White Space

		Cat garfield = felix;
		garfield.name = "Garfield";

		System.out.println(felix.name);
		System.out.println(puss.name);
		System.out.println(garfield.name);

		System.out.println();// White Space

		int value = 4;
		testMethod(value);
		System.out.println(value);

		System.out.println();// White Space

		value = testMethod2(value);
		System.out.println(value);

		System.out.println();// White Space

		testMethod(puss);
		System.out.println(puss.name);
	}

	private static void testMethod(int i) {
		System.out.println(i);
		i = i + 5;
		System.out.println(i);
	}

	private static int testMethod2(int i) {
		return i + 4;
	}

	private static void testMethod(Cat c) {
		System.out.println(c.name);
		c.name = "Rex";
		System.out.println(c.name);
	}
}

class Cat {
	String name;
}