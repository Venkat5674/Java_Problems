package map;

import java.util.TreeMap;

public class Test2 {
	public static void main(String[] args) {
		TreeMap<String, String> names = new TreeMap<String, String>();
		names.put("kumar", "kumari");
		names.put("Arun", "Aruna");
		names.put("Pranay", "Sundari");
//		names.put(null, "likitha");
		names.put("Subbarao", null);
		
		System.out.println(names);
	}
}

