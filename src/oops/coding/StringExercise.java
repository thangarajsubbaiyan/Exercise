package oops.coding;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class StringExercise {

	
	
	public  boolean hasUniqueCharcters(String string){
		char[] charArray = string.toCharArray();
		HashSet<String> hashSet = new HashSet<String>();
		
		for (char c : charArray) {
			if(! hashSet.add(String.valueOf(c))){
				return false;
			}
		}
		return true;
	}
	
	

}


