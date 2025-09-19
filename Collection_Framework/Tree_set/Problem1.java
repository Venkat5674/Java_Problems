package collections;

import java.util.TreeSet;

public class Test2 {
	
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>(new IntegerComparator());
		set.add(11);
		set.add(-1);
		set.add(15);
		set.add(30);
		set.add(22);
		
		System.out.println(set);
		
	}

}


