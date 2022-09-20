package corejava;

public class em {

	int cost;
	String mobile_name;
	String RAM;
	int storage;
	em( int price,String name,String ram,int space){
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
		em em1 = new em(12000,"VIVO","2GB",128);
		System.out.println();
		em pl = new em(15000,"MI","4GB",256);

	}

}
