package corejava;
import java.util.Scanner;
class electronices{
	String name;
	Scanner sc = new Scanner(System.in);
	void threatre() {
		System.out.println("Device name :");
		name=sc.nextLine();
	}
}
class home extends electronices{
	String company;
      void hm() {
    	  System.out.println("company is :");
    	  company=sc.nextLine();
      }
}
class cost extends home{
	int cost;
	void cost() {
		System.out.println("TV cost is :");
		cost=sc.nextInt();
	}
	void features () {
		System.out.println("inches : 55inches");
		System.out.println("quality is : 4K quality");
	}
}
public class muitilevel {
	public static void main(String[] args) {
		cost cs = new cost();
		cs.threatre();
		cs.hm();
		cs.cost();
		cs.features();
	}
}
