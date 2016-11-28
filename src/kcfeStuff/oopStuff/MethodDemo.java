package kcfeStuff.oopStuff;
// David O'Connor    13/10/2015
public class MethodDemo {

	public static void main(String[] args) {
		int num = 5;
		met1(num);
		System.out.println("main: " + num);
	}
	
	public static void met1(int value) {
		System.out.println("Met1: " + value);
		value++;
		System.out.println("Met1: " + value);
	}
	
}
