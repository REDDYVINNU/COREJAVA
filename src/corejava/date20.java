package corejava;
import java.util.Scanner;

class Square{
	int a;
	Scanner sc = new Scanner(System.in);
	
	void input () {
		System.out.println("enter the a value");
		 a = sc.nextInt();
	}
	void sqr() {
		System.out.println("square "+(a*a));
	}
}
class addition extends Square{
	int b;
	void accept() {
		System.out.println("enter the b value");
		 b= sc.nextInt();
		
	}
	void add() {
		System.out.println("sum "+(a+b));
	}
}
public class date20 {

	public static void main(String[] args) {
		addition ad = new addition();
		ad.input();
		ad.sqr();
		ad.accept();
		ad.input();
		ad.add();

	}

}
