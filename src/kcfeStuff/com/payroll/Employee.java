package kcfeStuff.com.payroll;
// David O'Connor    13/12/2015
public class Employee extends Person{
	
	String PPSN;
	
	// Override the printDetails method of the super class Person
	public void printDetails(){
		super.printDetails();
		System.out.println("PPS Number: " + PPSN);
	}
	
}