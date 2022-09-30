package Rohit_class;

import java.util.Scanner;

public class array_using_scanner {
	public static void main(String[] args) {
		int a[];
		a=new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("enter the array element");
			a[i]=sc.nextInt();
		}
			for(int i=0;i<5;i++) {
				System.out.println("a["+i+"]="+a[i]);
			}
	}

}
