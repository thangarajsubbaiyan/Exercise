package Collection.List;

import java.util.LinkedList;
import java.util.List;

import org.junit.runners.JUnit4;

public class LinkedListLearning {

	public static void main(String[] args) {
		
		LinkedList<String>  list = new LinkedList<String>();
		
		//list.addFirst(e);
		list.add("hai");
		list.add("hello");
		list.add("how");
		list.add("are");
		list.add("you");
		for (String string : list) {
			System.out.println("Value=="+string);
		}
		
		
	}

}
