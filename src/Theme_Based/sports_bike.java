package Theme_Based;

public class sports_bike {

	int cost;
	String bike_name;
	int bike_Cc;
	int no_of_gear;
	String color;
	
	sports_bike(int price,String vechile_name,int engine_Cc,int gear){
		
		this.cost=price;
		this.bike_name=vechile_name;
		this.bike_Cc=engine_Cc;
		this.no_of_gear=gear;
		this.bikedetails();
	}	
	sports_bike(){
		color="red";
		this.c();
	}
		void c(){
		System.out.println("bike color is "+color);
		
	}
	void bikedetails() {
		System.out.println("bike price "+cost);
		System.out.println("name "+bike_name);
		System.out.println("bike cc "+bike_Cc);
		System.out.println("manual gear "+no_of_gear);
		
	}
	public static void main(String[] args) { 
	
	}


	}


