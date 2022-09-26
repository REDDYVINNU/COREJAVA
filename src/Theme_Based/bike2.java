package Theme_Based;

public class bike2 {
	
	void details() {
		System.out.println("___bike details____");
	}
	void color(String color) {
		System.out.println("bike color is "+color);
	}
	String gears() {
		return "no of gears are 6";
	}
	String cost(int amount) {
		System.out.println("bike cost is "+amount);
		return "seating position only 2 members";
	}

	public static void main(String[] args) {
		bike2 ns = new bike2();
		ns.details();
		ns.color("white and black");
		System.out.println(ns.gears());
		System.out.println(ns.cost(150000));

	}

}
