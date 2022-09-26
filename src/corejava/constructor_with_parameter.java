package corejava;

public class constructor_with_parameter {
	int cost;
	String mobile_name;
	String RAM;
	int storage;
	constructor_with_parameter( int price,String name,String ram,int space){
		cost=price;
		mobile_name=name;
		RAM=ram;
		storage=space;
		this.details();
	}
	void details() {
		System.out.println("this ="+this);
		System.out.println("phone cost "+cost);
		System.out.println("phone name "+mobile_name);
		System.out.println("phone RAM "+RAM);
		System.out.println("phone storage "+storage);
	}

	public static void main(String[] args) {
		constructor_with_parameter em = new constructor_with_parameter(12000,"VIVO","2GB",128);
		System.out.println();
		constructor_with_parameter pl = new constructor_with_parameter(15000,"MI","4GB",256);

	}

}
