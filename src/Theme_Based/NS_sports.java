package Theme_Based;

public class NS_sports extends sports_bike{

	int bike_num;
	String owner_name;
	String speed_checkup;
	
	NS_sports(int bike_number,String name,String check){
		
		super(150000, "enfield", 350, 5);
		bike_num=bike_number;
		owner_name=name;
		speed_checkup=check;
		this.speed();
		
	}
	NS_sports(){
		super();
	}
	
	void speed() {
		System.out.println("bike number "+bike_num);
		System.out.println("owner name is "+owner_name);
		System.out.println("top speed is "+speed_checkup);
	}

	public static void main(String[] args) {
		NS_sports obj = new NS_sports(1332, "durga", "150km");
		NS_sports ohg = new NS_sports();

	}


}
