package Assignment;

class Exception{
	void arthemetic() {
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException obj) {
			obj.printStackTrace();
		}
		System.out.println("out from try catch block");
	}
}
public class Arthimetic_Exception {
	public static void main(String[] args) {
		Exception e = new Exception();
		e.arthemetic();

	}

}
