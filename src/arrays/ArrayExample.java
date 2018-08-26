package arrays;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
String[] aopnames ={"Federer","Cilic","Djokovic","Sandren"};
		
		String[] rolandgarrosName = new String[3]; 
		
		String[] rolandgarrosName1 = new String[]{};
		
		System.out.println("Serach results ="+ Arrays.binarySearch(aopnames, "Nadal"));
		
		
		Arrays.sort(aopnames);
		
		for (String string : aopnames) {
			System.out.println("Sorted ="+ string);
		}
		
		
		

	}

}
