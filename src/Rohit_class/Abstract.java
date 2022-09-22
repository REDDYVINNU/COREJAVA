package Rohit_class;
abstract class car{
	abstract void cost();
	abstract void milage();
	void start() {
		System.out.println("car should start with a key");
	}
	void engine_off() {
		System.out.println("engine off with key");
	}
}
class benz extends car {	
	void cost() {
		System.out.println("benz cost is 50lakhs");
	}
	void milage() {
		System.out.println("benz milage is 10km");
	}
}
class verna extends car{
	void cost() {
		System.out.println("verna cost is 12lakhs");
	}
	void milage() {
		System.out.println("verna milage is 9km");
	}
}
public class Abstract {
	public static void main(String[] args) {
	car z;
	System.out.println("____benz____");
	z=new benz();
	z.start();
	z.cost();
	z.milage();
	z.engine_off();
	System.out.println("____verna____");
	z=new verna();
	z.start();
	z.cost();
	z.milage();
	z.engine_off();
	}

}
