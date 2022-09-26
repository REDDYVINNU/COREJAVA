package Rohit_class;

interface Parent{
	int age = 33;
}
interface Child{
	int age = 29;
}
class Details implements Parent,Child{
	void details() {
		System.out.println("parent age is "+Parent.age);
		System.out.println("child age is "+Child.age);
	}
}
public class interface_variable {
	public static void main(String[] args) {
		Details d = new Details();
		d.details();
	}

}
