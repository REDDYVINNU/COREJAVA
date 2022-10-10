package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class students{
	int rollno;
	String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public students(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
}
public class Stream_using_filter_method {

	public static void main(String[] args) {
		List<students> h = new ArrayList<students>();
		h.add(new students(12312,"durga"));
		h.add(new students(12313,"vinay"));
		h.add(new students(12314,"surendra"));
		h.add(new students(12315,"nani"));
		Stream<students> s = h.stream().filter(g->g.rollno>12313);
		s.forEach(student->System.out.println(student.name));

	}

}
