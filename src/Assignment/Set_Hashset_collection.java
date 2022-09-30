package Assignment;
import java.util.HashSet;
import java.util.Set;
public class Set_Hashset_collection {
	public static void main(String[] args) {
	Set<String> h = new HashSet<String>();
	h.add("v");
	h.add("i");
	h.add("n");
	h.add("a");
	h.add("y");
	System.out.println(h);
	
	Set<String> v = new HashSet<String>();
	v.add("Invictes");
	v.add("Enginner");
	v.add("Hyderabad");
	System.out.println(v.size());
	
	Set<String> r = new HashSet<String>();
	r.add("SA7");
	r.add("SR nagar");
	System.out.println(r.contains("SA7"));
					
		Set<String> t = new HashSet<String>();
		t.add("JAVA");
		t.add("DEVELOPER");
		t.add("trained");
		t.remove("trained");
		System.out.println(t);
		
		Set<String> f = new HashSet<String>();
		f.add("Invictes");
		f.add("Enginner");
		f.add("Hyderabad");
		f.clear();
		System.out.println(f);
	}
}
