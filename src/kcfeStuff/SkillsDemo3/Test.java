package kcfeStuff.SkillsDemo3;
/*
 * David O Connor 			19/04/2016
 * Class Test 3
 */

import java.util.ArrayList;

import kcfeStuff.SkillsDemo3.Animal;

// Test Class
public class Test {
	public static void main(String[] args) {
		// Creates an array list
		ArrayList<Animal> AnimalList = new ArrayList<>();
		// Adds type of animal to the list
		AnimalList.add(new Horse());
		AnimalList.add(new Cat());
		AnimalList.add(new Dog());
		AnimalList.add(new Horse());
		AnimalList.add(new Cat());
		AnimalList.add(new Dog());
		AnimalList.add(new Cat());
		AnimalList.add(new Horse());
		AnimalList.add(new Dog());

		// Enhanced for loop
		for (Animal pet : AnimalList) {
			// if else statement which prints out statement dependent on animal type 
			if (pet instanceof Dog) {
				System.out.println("Dog - Check tail length and cut if necessary");
			} else if (pet instanceof Cat) {
				System.out.println("Cat - Check for flees");
			} else if (pet instanceof Horse) {
				System.out.println("Horse - Check Teeth");
			}
		}
	}
}
