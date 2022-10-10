package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream_collector_groupingby_and_counting {

	public static void main(String[] args) {
		List<String> h = Arrays.asList("durga","vinay","aravind","durga","vinay","durga","durga");
		Map<String,Long> a= h.stream().collect(
				Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(a);
	}
	
}
