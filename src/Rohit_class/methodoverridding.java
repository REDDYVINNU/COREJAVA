package Rohit_class;
class bicycle{
	void cost() {
		System.out.println("no cost");
	}
	void milage() {
		System.out.println("no milage");
		System.out.println("--------------");
	}
}
class Audi extends bicycle{
	void  cost() {
		System.out.println("Audi cost is 50lakhs");
	}
	void milage() {
		System.out.println("Audi milage is 10km");
		System.out.println("------------------");
	}
}
class BMW extends bicycle{
	void cost() {
		System.out.println("BMW cost islakhs");
	}
	void milage() {
		System.out.println("BMW milage is 15km");
		System.out.println("----------------");
	}
}
public class methodoverridding {
	public static void main(String[] args) {
		bicycle y = new bicycle();
		y.cost();
		y.milage();
		y=new Audi();
		y.cost();
		y.milage();
		y=new BMW();
		y.cost();
		y.milage();
	}

}
