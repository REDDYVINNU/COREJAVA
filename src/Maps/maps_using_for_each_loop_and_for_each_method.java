package Maps;

import java.util.Map;
import java.util.TreeMap;

public class maps_using_for_each_loop_and_for_each_method {

	public static void main(String[] args) {
		TreeMap<Float,Character> fc = new TreeMap<Float,Character>();
		fc.put(55.5f, 'V');
		fc.put(54.5f, 'I');
		fc.put(53.5f, 'N');
		fc.put(52.5f, 'A');
		fc.put(51.5f, 'Y');
		System.out.println(fc);
		System.out.println("");
		System.out.println("for Ecah loop");
		fc.forEach((key,value)->System.out.println(key+""+value));
		
		TreeMap<String,Double> sc = new TreeMap<String,Double>();
		sc.put("vinay", 309.31);
		sc.put("durga", 306.31);
		sc.put("sandeep", 308.31);
		sc.put("jithu", 314.31);
		System.out.println("");
		System.out.println("for each method");
		for(Map.Entry<String, Double> ee : sc.entrySet()) {
			System.out.println(ee.getKey()+""+ee.getValue());
		}
		
	}

}
