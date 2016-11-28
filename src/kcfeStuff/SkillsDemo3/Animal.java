package kcfeStuff.SkillsDemo3;
/*
 * David O Connor 			19/04/2016
 * Class Test 3
 */

// Creates an abstract class for animal
public abstract class Animal {

	// sets variables as private so they can't be accessed directly
	private String name;
	private int age;
	private String owner;

	//public getters and setters for each variable 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
