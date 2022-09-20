package corejava;

public class av1 extends av{

	int bike_num;
	String owner_name;
	String speed_checkup;
	
	av1(int bike_number,String name,String check){
		
		super(150000, "enfield", 350, 5);
		bike_num=bike_number;
		owner_name=name;
		speed_checkup=check;
		this.speed();
		
	}
	av1(){
		super();
	}
	
	void speed() {
		System.out.println("bike number "+bike_num);
		System.out.println("owner name is "+owner_name);
		System.out.println("top speed is "+speed_checkup);
	}

	public static void main(String[] args) {
		av1 obj = new av1(1332, "durga", "150km");
		av1 ohg = new av1();

	}


}
