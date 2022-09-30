package Maps;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_Iterator_using_collection {

	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("durga");
		ls.add("surendra");
		ls.add("jamili");
		ls.add("sai krishna");
		ls.add("prasanna");
		System.out.println(ls);
		ListIterator <String> h = ls.listIterator();
		while(h.hasNext()) {
			
			System.out.println(h.next());
			
		}
		System.out.println();
		while(h.hasPrevious()) {
			System.out.println(h.previous());
		}
		
	}

}
