package collections;

import java.util.ArrayList;
import java.util.Collections;

// Collection[I]
// Collections [C]
/*
 * Static methods
 * ---------------
 * sort(List l) 				- void
 * sort(List l, Comparator c)	- void
 * fill(List l)					- void
 * frequency(Collection c, ele)	- int
 * reverse(List l)				- void
 * max(Collection c)			- Object
 * max(Collection c)			- Object
 * min(Collection c,Comparator)	- Object
 * min(Collection c,Comparator)	- Object
 * shuffle(List l)				- void
 * 
 * 
 */
public class Test4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(10);
		list.add(19);
		list.add(20);
		list.add(11);
		list.add(11);
		
		
//		Collections.fill(list, 0);
//		System.out.println(Collections.frequency(list, 11));
//		Collections.reverse(list);
//		System.out.println(Collections.min(list));
		Collections.shuffle(list);
		
		System.out.println(list);
	}
}

