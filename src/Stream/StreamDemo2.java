package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class bikes{
	private int bike_no;
	private String bike_name;
	private int price;
	
	public bikes(int bike_no, String bike_name, int price) {
		super();
		this.bike_no = bike_no;
		this.bike_name = bike_name;
		this.price = price;
	}
	public int getBike_no() {
		return bike_no;
	}
	public void setBike_no(int bike_no) {
		this.bike_no = bike_no;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class StreamDemo2 {

	public static void main(String[] args) {
		List<bikes> bb = new ArrayList<bikes>();
		bb.add(new bikes(1122,"NS200",150000));
		bb.add(new bikes(2121,"NS160",120000));
		bb.add(new bikes(1212,"NS125",100000));
		bb.add(new bikes(1221,"NS250",170000));
		List<bikes>fl=bb.stream().filter(x->x.getPrice()==170000).collect(Collectors.toList());
		fl.forEach(y->System.out.println(y.getBike_no()+" "+y.getBike_name()+" "+y.getPrice()));
	}

}
