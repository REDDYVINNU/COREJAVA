package Assignment;

import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet_collection {
	public static void main(String[] args) {
		TreeSet<String> r = new TreeSet<String>();
		r.add("s");
		r.add("a");
		r.add("i");
		System.out.println(r);
		System.out.println(" ");
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(6);
		t.add(7);
		t.add(10);
		System.out.println("first method "+t.first());
		System.out.println("last method "+t.last());
		System.out.println("lower method "+t.lower(4));
		System.out.println("floor method "+t.floor(11));
		System.out.println("ceiling method "+t.ceiling(9));
		System.out.println("higher method "+t.higher(2));
		System.out.println("pollfirst method "+t.pollFirst());
		System.out.println("pollLast method "+t.pollLast());
		System.out.println("subset method "+t.subSet(1, 7));
		System.out.println("headset method "+t.headSet(4));
		System.out.println("tailset method "+t.tailSet(5));
	}

}
