package kcfeStuff.oopStuff;
// David O'Connor    13/11/2015
public class ArrayDemo {

	public static void main(String[] args) {
		int value = 5;
		
		int[] intArray;
		intArray = new int[5];
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		intArray[1] = 500;
		intArray[0] = 24;
		intArray[4] = 1024;
 		
		for(int i = 0; i < 5; i++){
			System.out.println(intArray[i]);
		}
		
		int[] intArr2 = new int[10];
		
		int[] wednesdayLottoNumbers = {3,11,12,21,22,33};
		String[] firstNames = {"Tom", "Ann", "Brendan","Pat"};
		
		for(int i = 0; i < firstNames.length; i++){
			System.out.println(firstNames[i]);
		}
	}

}
