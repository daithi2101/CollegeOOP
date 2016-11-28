// David O'Connor		 5/10/2015
package kcfeStuff.oopStuff;

public class CastingDemo {
	// double
		// float
		// long
		// int
		// short / char
		// byte
		public static void main(String[] args) {
			byte age = 15;
			int newAge = age;// Up casting going(from a byte to a int is fine but
								// other way will get an error)
			System.out.println(newAge);

			int price = 89;
			byte newPrice = (byte) price;// Down casting (without the (byte) you
											// would get an error as an int will not
											// fit into a byte)
			System.out.println(newPrice);// using (byte) tells the computer that we
											// want to use int into byte

			int value1 = 10000;
			double value2 = value1;
			System.out.println(value2);// up casting

			double value3 = 3.14;
			int value4 = (int) value3;
			System.out.println(value4);// will only print 3 as it doesnt round up or
										// down

			int bigA = 'A';
			System.out.println(bigA);// prints unicode value
										// http://unicode.org/charts/PDF/U0000.pdf,http://unicode-table.com/en/#control-character
			System.out.println((char) bigA);

			byte b1 = 5;
			byte b2 = 3;
			byte b3 = (byte) (b1 + b2);// the result is an int or higher (byte +
										// byte = int)
			b3 = (byte) (b1 - b2);
			b3 = (byte) (b1 * b2);

			int i1 = 10000;
			long l1 = 1000;
			int result = (int) (i1 + l1);

			int i3 = 2000000000;
			int i4 = 2000000000;
			long i5 = (long) i3 + i4;// have to use long as max value of int is 2
										// billion

			System.out.println(i5);

			System.out.println(Integer.MAX_VALUE);// max value of an integer

			System.out.println(3.2 - 1.9);
		}
}
