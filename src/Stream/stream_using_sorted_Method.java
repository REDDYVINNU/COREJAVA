package Stream;

import java.util.stream.Stream;

public class stream_using_sorted_Method {

	public static void main(String[] args) {
		Stream.of("durga","vinay","surendra").sorted().forEach(r->System.out.println(r));

	}

}
