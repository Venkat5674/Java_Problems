package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/*
 * 	Map
 * --------------
 * 1. key:value -> entry
 * 2. not allows duplicate keys
 * 3. allows duplicate values
 * 
 * 
 * put(key,value) 				- value
 * putIfAbsent(key,value)		- value
 * replace(key,newvalue)		- value
 * containsKey(key)				- boolean
 * containsValue(value)			- boolean
 * get(key)						- value
 * getOrDefault(key,defaultvalue)- value
 * remove(key)					- value
 * remove(key,value)			- boolean
 * size()						- int
 * isEmpty()					- boolean
 * clear()						- void
 * keySet()						- Set<Key>
 * 
 * 
 * 
	

*/
// student - age;
public class Test1 {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String, Integer>();
//		System.out.println(map.put("Pranay", 26)); 	// null
//		System.out.println(map.put("Pranay", 25));	// 26
		
		map.put("Kamal", 30);
		map.put("Mukul", 30);
		map.put("kumari", 45);
		
//		System.out.println(map.containsKey("Mukul"));
//		System.out.println(map.containsValue(10));
		
//		System.out.println(map.size());
//		System.out.println(map.isEmpty());
		
//		System.out.println(map.get("Mahesh")); // null
//		System.out.println(map.getOrDefault("Mahesh", 18)); // 18
		
		
//		map.clear();
		
//		map.putIfAbsent("kumari", 40);
		
//		System.out.println(map.replace("kumar", 30));
		
//		System.out.println(map.remove("Kamal"));
		
//		map.remove("kumari", 40);
		
		
		
		Set<String> keys = map.keySet();
		
		for(String key:keys) {
			Integer value = map.get(key);
			System.out.println(key+"  "+value);
		}
		
	
		
		System.out.println(map);
	}
}
