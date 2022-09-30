package Rohit_class;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class maps_in_collections {

	public static void main(String[] args) {
	HashMap<Integer,String> hs = new HashMap<Integer,String>();
	System.out.println("my room mates pay the rent per each is");
	hs.put(1100, "sandeep");
	hs.put(1125, "sai vinay");
	hs.put(1120, "durga");
	hs.put(1115, "pavan");
	hs.put(1110, "jithu");
	System.out.println(hs);
	System.out.println(" ");
	
	 LinkedHashMap<Double,String> hm = new LinkedHashMap<Double,String>();
	 System.out.println("share the every thing");
	 hm.put(50.0, "jithu");
	 hm.put(100.0, "sathya");
	 hm.put(40.0, "durga");
	 hm.put(30.0, "vinay");
	 hm.put(20.0, "pavan");
	 System.out.println(hm);
	 System.out.println(" ");
	 
	 TreeMap<Character,String> ts = new TreeMap<Character,String>();
	 ts.put('D', "Durga");
	 ts.put('J', "Jamili");
	 ts.put('S', "Sathya");
	 ts.put('P', "Pavan kumar");
	 ts.put('V', "Vinay");
	 System.out.println(ts);
	}

}
