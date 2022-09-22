package Assignment;
import java.util.Scanner;
abstract class soft{
	String drinks;
	int price;
	abstract void workingarea();
	abstract void manufaturingcompany();
		soft(String drinks1,int price1) {
			this.drinks=drinks1;
			this.price=price1;
		}
			void show(){
			System.out.println("soft drinks "+drinks);
			System.out.println("soft drinks "+price);
		}
}
class sprite extends soft{
	sprite(String drinks,int price){
	super( drinks, price);}
	void workingarea() {
	System.out.println(" manufaturing area : MLR hstl");
	}
	void manufaturingcompany() {
		System.out.println("company : coco cola");
	}
}
class thumbsup extends soft{
	thumbsup(String drinks1, int price1) {
		super(drinks1, price1);
	}
	void workingarea() {
	System.out.println(" manufaturing area : forest");
	}
	void manufaturingcompany() {
		System.out.println("company : coco cola");
	}
}
public class abstractinconstructor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		soft g;
		g=new sprite(sc.next(),sc.nextInt());
		g.workingarea();
		g.manufaturingcompany();
		g=new thumbsup(sc.next(),sc.nextInt());
		g.workingarea();
		g.manufaturingcompany();
	}

}
