package Rohit_Class_Exception_Handling;

class main{
	static void checkage(int age) {
		if(age>18) {
			System.out.println("eligible for voting");
		}
		else {
			System.out.println("not eligible");
		}
	}
}
public class throw_keyword {
	public static void main(String[] args) {
	main m = new main();
	m.checkage(18);
	}

}
