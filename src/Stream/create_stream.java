package Stream;

import java.util.stream.Stream;

public class create_stream {

	public static void main(String[] args) {
		Stream<String> ss = Stream.of("vinay","surendra");// using the string
		//ss.forEach(System.out::println);
		ss.forEach(x->System.out.println(x));
		System.out.println("*****************");
		Stream<Integer> hh = Stream.of(new Integer[]{1,2,3,4,5});// using the integer
		//hh.forEach(System.out::println);
		hh.forEach(y->System.out.println(y));
}
}
