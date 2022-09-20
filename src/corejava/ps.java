package corejava;

 class cs {

	cs(int age){
		System.out.println("age is "+age);
	}
 }
 public class ps extends cs{
	ps(int age){
	super(22);
		System.out.println("age is "+age);
	}
 
	public static void main(String[] args) {
		ps x = new ps(33);
	}
}
