package kcfeStuff.com.payroll;
// David O'Connor    13/12/2015
import java.util.Date;

public class TestClass {
	
	public static void main(String[] args){
		Person p1 = new Person();
		p1.setName("Jane");
		
		Employee intern = new Employee();
		System.out.println(">>" + intern.getName() + "<<");
		intern.setName("Pat");
		intern.setAddress("1263 Main St. Tralee");
		intern.setDob(new Date(10000));
		intern.PPSN = "7896542D";
		
		intern.printDetails();
		
		System.out.println(p1.getName() + " " + intern.getName());
		
		Doctor docBrown= new Doctor();
		docBrown.setName("Emmet");
		
		System.out.println(docBrown.getName() + " " + p1.getName() + " " + intern.getName());
	}
}