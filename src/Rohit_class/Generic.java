package Rohit_class;

class Sample<S>{
	void show(S v) {
		System.out.println(v);
	}
}
public class Generic {
	public static void main(String[] args) {
		Sample<Integer> s = new Sample<Integer>();
		s.show(200);
		Sample<Integer> v = new Sample<Integer>();
		v.show(1000);
		Sample<Double> r = new Sample<Double>();
		r.show(3.5);
		Sample<String> y = new Sample<String>();
		y.show("vinay");
	}

}
