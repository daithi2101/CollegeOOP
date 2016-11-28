package kcfeStuff.com.vets;
// David O'Connor    13/12/2015
public class Cat extends Animals{
	int lives = 9;
	
	public void meow(){
		if(this.isAlive()){
			System.out.println("Meow");
		}
	}
}