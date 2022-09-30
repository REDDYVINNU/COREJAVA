package Rohit_class;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_ArrayList_collection {
	public static void main(String[] args) {
		System.out.println("ArrayList");
		List<Integer> l = new ArrayList<Integer>();
		l.add(22);
		l.add(33);
		l.add(44);
		l.add(55);
		l.add(66);
		System.out.println(l);
		System.out.println(" ");
		
		System.out.println("LinkedList");
		List<Integer> p = new LinkedList<Integer>();
		p.add(11);
		p.add(77);
		p.add(88);
		p.add(99);
		p.add(212);
		System.out.println(p);
		System.out.println(" ");
		
		System.out.println("vector");
		List<Integer> t = new Vector<Integer>();
		t.add(21);
		t.add(22);
		t.add(23);
		t.add(24);
		t.add(25);
		t.set(2, 99);
		System.out.println(t);
		System.out.println(t.get(3));
		
	}

}
