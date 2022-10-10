package Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_in_collection_adding_Iterator {

	public static void main(String[] args) {
	TreeMap<Integer,String> tp = new TreeMap<Integer,String>();
	tp.put(309, "Vinay");
	tp.put(310, "surendra");
	tp.put(311, "pavan kalyan");
	tp.put(313, "uday");
	tp.put(314, "jithu");
	System.out.println(tp);
//	Set s = tp.entrySet();
//	Iterator i = s.iterator();
//	while(i.hasNext()) {
//		System.out.println(i.next());
//		/*Entry<Integer,String> rr = (Entry<Integer,String>)i.next();
//		System.out.println(rr);*/
//	}
	
	//tp.forEach((key,value)->System.out.println(key+""+value));
	
	for(Map.Entry<Integer,String> ee : tp.entrySet()) {
		System.out.println(ee.getKey()+""+ee.getValue());
	}
	}

}
