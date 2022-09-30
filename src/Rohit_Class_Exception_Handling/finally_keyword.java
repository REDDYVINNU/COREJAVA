package Rohit_Class_Exception_Handling;

public class finally_keyword {

	public static void main(String[] args) {
		try {
			int[] mynumber = {1,2,3,4};
			System.out.println(mynumber[5]);
		}
		catch(Exception obj) {
			System.out.println("something went wrong");
		}
		finally {
			System.out.println("the try and catch is finished");
		}

	}

}
