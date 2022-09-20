package corejava;
class car{
	void cost() {
		System.out.println("no cost");
	}
	void milage() {
		System.out.println("no milage");
		System.out.println("--------------");
	}
}
class Audi extends car{
	void  cost() {
		System.out.println("Audi cost is 50lakhs");
	}
	void milage() {
		System.out.println("Audi milage is 10km");
		System.out.println("------------------");
	}
}
class BMW extends car{
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
		car y = new car();
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
