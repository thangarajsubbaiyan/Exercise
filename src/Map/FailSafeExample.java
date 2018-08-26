package Map;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample
{
    
    
    public static void main(String[] args)
    {
        ConcurrentHashMap<String,Integer> map = 
                               new ConcurrentHashMap<String,Integer>();
        map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);
        
        Iterator iterator = map.keySet().iterator();
        
        while (iterator.hasNext())
        {
        	String key =(String) iterator.next();
           // System.out.println(premiumPhone.get(key));
        	System.out.println(key + " : " + map.get(key));
        	map.put("SEVEN", 7);
           
        }
        
    }
    
}