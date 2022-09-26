package Theme_Based;

class sportsbike{
	int bikeno;
	String bike_name;
	char grade;
	long regestration_no;
	byte seating_in_all;
	static String fuel_capacity;
	String color;
	float horse_power;
	int number_of_cylinder;	
}

public class bike {

	public static void main(String[] args) {
		sportsbike ns = new sportsbike();
		ns.bikeno=1111;
		ns.bike_name="himalayan";
		ns.grade='A';
		ns.regestration_no=2016;
		ns.seating_in_all=2;
		sportsbike.fuel_capacity="13L";
		ns.color="black&white";
		ns.horse_power=10.00f;
		ns.number_of_cylinder=1;
		System.out.println("bike no AP20AH"+ns.bikeno);
		System.out.println("bike name "+ns.bike_name);
		System.out.println("bike grade :"+ns.grade);
		System.out.println("bike date of reg :"+ns.regestration_no);
		System.out.println("seating capacity :"+ns.seating_in_all);
		System.out.println("fuel capacity :"+sportsbike.fuel_capacity);
		System.out.println("bike color :"+ns.color);
		System.out.println("bike horse power :"+ns.horse_power);
		System.out.println("no of cylinder :"+ns.number_of_cylinder);

	}

}
