package kcfeStuff.oopStuff;
// David O'Connor    13/12/2015
public class Car {

	private String make;
	private String model;
	private int engineSize;

	// empty constructor
	public Car() {
		/**
		 * make and model both initialised to null (all Strings initialise to
		 * null if not set) engineSize initialised to 0 (all integers initialise
		 * to 0 is not set)
		 */
	}

	// constructor to initialise make and model and engineSize
	public Car(String mk, String md, int e) {
		this.make = mk;
		this.model = md;
		this.engineSize = e;
	}

	// note the return type is a String as make is a String
	public String getMake() {
		/**
		 * you can use "this" to access the make instance variable here "this"
		 * refers to this objects instance variables
		 */
		return this.make;
	}

	public String getModel() {
		/**
		 * or as there is no other variable called model you can access it
		 * directly without the use of "this"
		 */
		return model;
	}

	// note the return type is an int as engineSize is an int
	public int getEngineSize() {
		return engineSize;
	}

	/**
	 * if the parameter you pass in has the same name as the instance variable
	 * the make on it's own refers to the parameter value and this.make refers
	 * to the instance variable
	 */

	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * if the parameter does not have the same name then you do not have to use
	 * this you can refer the the instance parameter as simply model as there is
	 * no other variable called model
	 */
	public void setModel(String md) {
		model = md;
	}

	public void setEngineSize(int e) {
		engineSize = e;
	}

	/**
	 * we are now going to override the objects toString() method so that our
	 * version will run if we try to print out a Car object in the main program
	 * if we do the following Car c = new Car(); System.out.println(c); the
	 * program will attempt to print the Car object - in order to do this it
	 * will implicitly call the toString() method
	 **/
	@Override
	public String toString() {
		return "Make: " + make + " - Model: " + model + " - Engine Size:" + engineSize;
	}

	// this method takes in another Car object to compare to the existing object
	public boolean equals(Car c) {

		/**
		 * notice we use the equals method of the string to compare if the make,
		 * model and engine size are the same for them both Strings and the ==
		 * to compare ints
		 */

		if (c.getMake().equals(make) && c.getModel().equals(model) && c.getEngineSize() == engineSize) {
			return true;
		} else {
			return false;
		}
	}

}
