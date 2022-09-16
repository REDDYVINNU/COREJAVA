package corejava;
import java.util.Scanner;

public class demo3 {
	
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
	demo3 d = new demo3();
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
