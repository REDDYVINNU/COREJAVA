package corejava;

class parent {
	parent(int age){
		System.out.println("age is "+age);
	}
 }
 public class child extends parent{
	child(int age){
	super(22);
		System.out.println("age is "+age);
	}
 
	public static void main(String[] args) {
		child x = new child(33);
	}
}