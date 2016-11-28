package kcfeStuff.com.vets;
// David O'Connor    13/12/2015
public class TestVet {

	public static void main(String[] args) {
		Vet tom = new Vet();
		
		Cat felix = new Cat();
		felix.setAlive(true);
		felix.meow();
		
		Dog rex = new Dog();
		rex.setAlive(true);
		rex.bark();
		
		tom.putDown(rex);
		tom.putDown(felix);
		
		rex.bark();
		felix.meow();
		
		// Polymorphic Reference
		Animals pet1 = new Dog();
		pet1 = new Cat();
		System.out.println("Tom you maniac! Your gonna get us all killed!!!");
		
		Animals[] animals = {new Cat(), new Dog(), new Cat(), new Cat(), new Dog()};
		for(int i = 0; i < animals.length; i++){
			tom.putDown(animals[i]);
		
		// pet is of type animal and only has access to methods declared in animal and above
		// pet.meow(); <-- compiler error as meow() is declared in Cat
		}
		
		pet1.setAlive(true);
		
		Cat puss = (Cat)pet1;
		
		// Bring all the animals back to life
		for(int i = 0; i < animals.length; i++)
			animals[i].setAlive(true);
		
		for(int i = 0; i < animals.length; i++){
			// You hate cats and only kick them
			if(animals[i].getClass().getName().equals("com.vets.Cat")){
				System.out.println("Kick");
				Cat temp = (Cat)animals[i];
				temp.meow();
			}else{
				System.out.println("A dog");
			}
		}
	}
}