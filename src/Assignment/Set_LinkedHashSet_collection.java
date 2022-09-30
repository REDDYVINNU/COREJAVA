package Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet_collection {
	public static void main(String[] args) {
	Set<String> l = new LinkedHashSet<String>();
	l.add("v");
	l.add("i");
	l.add("n");
	l.add("a");
	l.add("y");
	System.out.println(l);
	
	Set<Integer> r = new LinkedHashSet<Integer>();
	r.add(1);
	r.add(4);
	r.add(3);
	System.out.println(r);
	
	}

}
