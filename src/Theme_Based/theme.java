package Theme_Based;
class NS{
	void cost() {
		System.out.println("the bike cost is : 50000");
	}
	void insurence () {
		System.out.println("bike insurence is : 15years");
	}
}
class royal extends NS{
	void cost() {
		System.out.println("the bike cost is : 75000");
	}
	void insurence() {
		System.out.println("bike insurence is : 10years");
	}
}
class himalayan extends NS {
	void cost() {
		System.out.println("the bike cost is : 150000 ");
	}
	void insurence() {
		System.out.println("bike insurence is : 10years");
	}
}
public class theme {
	public static void main(String[] args) {
	NS z = new NS ();
	z.cost();
	z.insurence();
	z=new royal();
	z.cost();
	z.insurence();
	z=new himalayan();
	z.cost();
	z.insurence();
	}
}
