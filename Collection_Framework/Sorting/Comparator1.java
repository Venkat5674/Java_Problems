package collections;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Comparable - compareTo(Object o)
 * Comparator - compare(Object o1,Object o2)
 * 
 * 
 */

// Collections.sort(List l), PriorityQueue, TreeSet, TreeMap
public class Test1 {
	public static void main(String[] args) {
		Fruit f1 = new Fruit("Mango", "Yellow", 60);
		Fruit f2 = new Fruit("Apple", "Red", 100);
		Fruit f3 = new Fruit("Custard Apple", "Green", 30);
		Fruit f4 = new Fruit("Guava", "Green", 45);
		
		
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(f4);
		list.add(f3);
		list.add(f2);
		list.add(f1);
		
		for(Fruit f:list) {
			System.out.println(f);
		}
		
		Collections.sort(list);
		
		System.out.println("After sorting based on color");
		for(Fruit f:list) {
			System.out.println(f);
		}
		
		Collections.sort(list, new PriceComparator());
		
		System.out.println("After sorting based on Price");
		
		for(Fruit f:list) {
			System.out.println(f);
		}

	}
}

