package Rohit_Class_Exception_Handling;

public class using_try_catch_block {

	public static void main(String[] args) {
	try {
		int[] mynumber = {1,2,3,4,5};
		System.out.println(mynumber[10]);
	}
	catch(Exception obj) {
		System.out.println("something went wrong" );
	}
	}
	
}