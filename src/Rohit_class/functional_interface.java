package Rohit_class;

interface Dog{
	void bark();
	static void eat() {
		System.out.println("Eating paadigree");
	}
	default void sleep() {
		System.out.println("sleeps 12hours");
	}
}
public class functional_interface implements Dog{

	public static void main(String[] args) {
		functional_interface l = new functional_interface();
		l.bark();
		l.sleep();
		Dog.eat();

	}

	@Override
	public void bark() {
		System.out.println("bark alound");
		
	}

}
