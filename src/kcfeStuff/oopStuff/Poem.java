package kcfeStuff.oopStuff;
// David O'Connor    15/10/2015
public class Poem {
	
	public static void main(String[] args) {
		System.out.println("Start");
		Poem p = new Poem();// this will envoke them poem
		p.line1();
		p.line2();

	}

	void line1() {// methods
		System.out.println("As I was walking out one day,");
		System.out.println("my head fell off and rolled away.");
	}

	void line2() {
		System.out.println("I really didn't miss my head,");
		System.out.println("It doesn't bother my, I'm dead.");
	}
	
}
