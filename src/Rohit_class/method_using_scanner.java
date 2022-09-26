package Rohit_class;
import java.util.Scanner;

public class method_using_scanner {
	
	void sum(int x, int y){
		System.out.println("addition :"+(x+y));
	}
	void sum(float a ,int b) {
		System.out.println("subtraction:"+(a-b));
	}
	void sum(int b,float a) {
		System.out.println("mul:"+(a*b));
	}
	void sum(double a,float b) {
		System.out.println("division:"+(a/b));
	}


public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	method_using_scanner d = new method_using_scanner();
	System.out.println("enter the number");
	int x = sc.nextInt();
	int y = sc.nextInt();
	d.sum(x,y);
	float a=sc.nextFloat();
	int b =sc.nextInt();
	d.sum(a,b);
	d.sum(sc.nextInt(),sc.nextFloat());
	d.sum(sc.nextDouble(), sc.nextFloat());
	
}}
