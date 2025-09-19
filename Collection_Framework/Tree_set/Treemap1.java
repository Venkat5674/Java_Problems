package collections;

import java.util.TreeMap;

public class Test3 {
	public static void main(String[] args) {
		TreeMap<String,Integer> map = new TreeMap<String, Integer>(new StringComparator());
		map.put("Anantapur", 515521);
		map.put("Kvp", 515571);
		map.put("Ammerpet", 515234);
		map.put("Nizampet", 56789);
		
		
		System.out.println(map);
	}
}
