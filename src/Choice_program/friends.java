package Choice_program;

abstract class person{
	abstract void name();
	abstract void age();
	 void show() {
		 System.out.println("__my room mates__");
	 }
}
class person1 extends person{
	void name() {
		System.out.println("durga");
	}
	void age() {
		System.out.println("age : 21");
	}
}
class person2 extends person{
	void name() {
		System.out.println("jithu");
	}
	void age() {
		System.out.println("age : 21");
	}	
}
public class friends {
	public static void main(String[] args) {
		person fr;
		fr=new person1();
		fr.name();
		fr.age();
		fr=new person2();
		fr.name();
		fr.age();

	}

}
