package Stream;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class create_stream_using_list {

	public static void main(String[] args) {
		List<String> h = Arrays.asList("lokesh,surendra");
		Stream<String> d =h.stream();
		//d.forEach(System.out::println);
		d.forEach(e->System.out.println(e));

	}

}
