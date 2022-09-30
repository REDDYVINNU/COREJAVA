package corejava;
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
class FactoryMethod{
	bicycle getbicycle(String carname) {
		if(carname.equals("Audi"))
		return new Audi();
		else if (carname.equals("BMW"))
			return new BMW();
		else
			return null;
	}
}
public class Factory_Method {

	public static void main(String[] args) {
	FactoryMethod b = new FactoryMethod();
	bicycle x = b.getbicycle("BMW");
	x.cost();
	x.milage();

	}

}
