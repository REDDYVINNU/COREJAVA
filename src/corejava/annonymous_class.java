package corejava;

abstract class Challenge{
	abstract void eat();	
	}
public class annonymous_class {
	public static void main(String[] args) {
		Challenge c = new Challenge() {
			void eat() {
				System.out.println("Biriyani eating challenge");
				System.out.println("In time complete the chellenge ");
				System.out.println("You won the price.");
			}
		};
		c.eat();
	}

}
