
package map;

import java.util.ArrayList;
import java.util.Hashtable;
/*
 * Map
 * ----------
 * 1. It is an parent interface present inside the collection framework
 * 2. It will store data in key and value pair.
 * 3. Each key - value pair is known as entry.
 * 4. It will not allows duplicate keys
 * 5. it will allows duplicate values.
 * 6. Implementation classes of Map
 * 		6.1 HashMap
 * 		6.2 LinkedhashMap
 * 		6.3 HashTable
 * 		6.4 TreeMap
 * 
 *  HashMap
 *  -------------
 *  1. It is the implemnattion class of Map.
 *  2. It will internally uses the hashing technique to store the keys.
 *  3. It will not preserves insertion order.
 *  4. Methods are not synchronized.
 *  5. It is not thread - safe.
 *  
 *  LinkedHashMap
 *  -------------
 *  1. It is the child class of HashMap.
 *  2. It will internally uses the hashing technique to store the keys.
 *  3. It will preserves insertion order.
 *  4. Methods are not synchronized.
 *  5. It is not thread - safe.
 *  
 *  HashTable
 *  --------------
 *  1. It is the implemnation class of Map.
 *  2. It will internally uses the hashing technique to store the keys.
 *  3. It will  preserves insertion order.
 *  4. Methods are  synchronized.
 *  5. It is thread - safe.
 *  
 *  
 *  note:
 *  ----------
 *  1. HashMap and LinkedHahMap will accepts only null key and accepts multiple null values
 *  2. HashTable will not accepts null as key or value
 *  3. the key class should override hashcode and equals methods.
 *  
 *  
 *  TreeSet
 *  ----------
 *  1. It is the implementation class of Map interface.
 *  2. It will internally sorts the data.
 *  3. The key class should implements Comprable interface.
 *  4. It will not accepts null as keys.
 * 
 * 
 * 
 */

public class Test3 {
	public static void main(String[] args) {
		Hashtable<String, ArrayList<Integer>> hashtable = new Hashtable<String, ArrayList<Integer>>();
		ArrayList<Integer> marks1 = new ArrayList<Integer>();
		marks1.add(10);
		marks1.add(1);
		marks1.add(50);
		
		hashtable.put("kiran", marks1);
//		hashtable.put(null, marks1);
//		hashtable.put("khan", null);
		
		
		System.out.println(hashtable);
	}
}













