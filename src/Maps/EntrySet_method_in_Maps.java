package Maps;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet_method_in_Maps {

	public static void main(String[] args) {
	TreeMap<Integer,String> ts = new TreeMap<Integer,String>();
	ts.put(5, "sahoo");
	ts.put(7, "bahubali");
	ts.put(9, "salaar");
	ts.put(2, "adipurush");
	System.out.println(ts);
	Set<Entry<Integer,String>> s = ts.entrySet();
	Iterator<Entry<Integer,String>> i = s.iterator();
	while(i.hasNext()) {
		Entry<Integer, String> ee=i.next();
		System.out.println(ee.getKey()+""+ee.getValue());
		
	}
	}

}
