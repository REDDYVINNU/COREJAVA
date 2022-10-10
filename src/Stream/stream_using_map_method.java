package Stream;

import java.util.Arrays;
import java.util.List;

public class stream_using_map_method {

	public static void main(String[] args) {
		List<String> h = Arrays.asList("durga","vamshi","roopa","laddu");
		//h.stream().map(String::toUpperCase).forEach(s->System.out.println(s));
		h.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
