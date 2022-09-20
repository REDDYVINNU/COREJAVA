package corejava;
import java.util.Scanner;
class bikes{
	String name;
	Scanner sc = new Scanner(System.in);
	void bike_name() {
		System.out.println("I selected the :");
		name=sc.nextLine();
	}	
}
class rate extends bikes{
	int cost;
		void price() {
		System.out.println("the bike cost is :");
		cost=sc.nextInt();
	}
}
class features extends bikes{
 	void features() {
 		System.out.println("self Starting is : available");
 		System.out.println("LED light is : available");
 	}
}
public class hirarichal {
	public static void main(String[] args) {
		rate cs = new rate();
		cs.price();
		features fs = new features();
		fs.bike_name();
		fs.features();
		
		
		

	}

}
