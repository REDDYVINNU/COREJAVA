package Stream;
import java.util.stream.*;
public class stream_using_distinct_methods {

	public static void main(String[] args) {
		Stream.of("aravind","friends","nani","vinay").distinct().forEach(s->System.out.println(s));

	}

}
