package kcfeStuff.oopStuff;
// David O'Connor    13/10/2015
public class CarMain {

	public static void main(String[] args) {
		// using the empty constructor
				Car c1 = new Car();
				// should print out Make: null - model: null - Engine Size: 0
				System.out.println(c1);

				// using the constructor to initialise 3 car objects
				Car c2 = new Car("Ford", "Fiesta", 1400);
				Car c3 = new Car("Honda", "Civic", 1800);
				Car c4 = new Car("Ford", "Fiesta", 1400);

				// print out cars c2, c3 and c3
				// remember this will implicitly call the toString() method
				System.out.println(c2);
				System.out.println(c3);
				System.out.println(c4);

				// check is c2 the same as c4
				if (c2.equals(c4)) {
					System.out.println("Car 2 and Car 4 are the same");
				} else {
					System.out.println("Car 2 and Car 4 are not the same");
				}

				// check is c3 the same as c4
				if (c3.equals(c4)) {
					System.out.println("Car 3 and Car 4 are the same");
				} else {
					System.out.println("Car 3 and Car 4 are not the same");
				}

				// change the size of c2's engine to 1600
				c2.setEngineSize(1600);

				// print it out to see if it updated
				System.out.println(c2);

				// now check if c2 still the same
				if (c2.equals(c4)) {
					System.out.println("Car 2 and Car 4 are the same");
				} else {
					System.out.println("Car 2 and Car 4 are not the same");
				}
	}

}
