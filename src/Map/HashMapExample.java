package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.*;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, String> map  = new HashMap<>();
		
		map.put("1","one");
		map.put("2","two");
		map.put("3","three");
		map.put("4","four");
		map.put("5","five");
		
	   Set<Entry<String,String>> entrySet =	map.entrySet();
	   
	    Iterator<Entry<String,String>>  iterator =  entrySet.iterator();
	    while (iterator.hasNext()) {
			Entry entry = iterator.next();
			System.out.println(entry.getKey()+"="+entry.getValue()); ;
			
		}

	}

}
