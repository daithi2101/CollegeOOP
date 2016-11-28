package kcfeStuff.com.payroll;
// David O'Connor    13/12/2015
import java.util.Date;

public class Person {
	
	private String name;
	private String address;
	private Date dob = new Date();
	
	public Person(){
		super();
	}
	
	public Person(String newName, String newAddress){
		super();
		this.setName(newName);
		this.setAddress(newAddress);
	}
	
	public Person(String n){
		
	}
	
	public String getName(){
		return name;
	}
	public void setName(String newName){
		if(newName == null || newName.equals(""))
			System.out.println("Invalid name!!");
		else
			name = newName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date newDob) {
		this.dob = newDob;
	}
	
	void printDetails(){
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Date of Birth: " + dob.toString());
	}
	
}
