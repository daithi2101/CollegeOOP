package kcfeStuff.com.vets;
// David O'Connor    13/12/2015
public class Dog extends Animals{

	public void bark(){
		if(this.isAlive()){
			System.out.println("Woof Woof");
		}
	}
}