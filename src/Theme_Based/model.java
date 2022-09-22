package Theme_Based;
abstract class bikes{
	abstract void model();
	abstract void price();
	void details() {
		System.out.println("____bike details___");
	}
} 
class kawaski extends bikes{
	void model() {
		System.out.println("kawaski model is 2016 is good");
	}
	void price() {
	System.out.println("around price is 3.5lakhs");
	}
}
class bmw extends bikes{
	void model() {
		System.out.println("bmw bike model is 2018 is good");
	}
	void price() {
		System.out.println("around price is 4lakhs");
			}
}
public class model {
	public static void main(String [] args) {
		bikes y;
		y=new kawaski();
		y.model();
		y.price();
		y=new bmw();
		y.model();
		y.price();
		
		
		
	}
}
