package Map;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeItr {
	public static void main(String[] args)
	{

		// Creating a ConcurrentHashMap
		ConcurrentHashMap<String, Integer> map
			= new ConcurrentHashMap<String, Integer>();

		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);

		// Getting an Iterator from map
		Iterator it = map.keySet().iterator();

		while (it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key + " : " + map.get(key));

			map.put("SEVEN", 7);
		}
		
		Set set=  map.entrySet();
	}
}