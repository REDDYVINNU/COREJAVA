package Assignment;
abstract class animal{
	abstract void lifespan();
	abstract void weight();
	void breath() {
		System.out.println("living  on earth");
	}
}
class elephant extends animal{
	void lifespan() {
		System.out.println("lived in around 60-70years");
	}
	void weight() {
	System.out.println("average weight is 4000kg's");
	}
}
class panda extends animal{
	void lifespan() {
	System.out.println(" lifespan is about 15-20 years");
	}
	void weight() {
		System.out.println("weight up to 113kg");
	}
}
public class Abstractusinganimal {
	public static void main(String[] args) {
		animal u;
		System.out.println("--elephant_______________");
		u=new elephant();
		u.breath();
		u.lifespan();
		u.weight();
		System.out.println("--panda________________");
		u=new panda ();
		u.breath();
		u.lifespan();
		u.weight();
		

	}

}
