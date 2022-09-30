package Rohit_class;

import java.util.Scanner;

public class arrays_using_for_each_loop {

	public static void main(String[] args) {
		int a[];
		a=new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
		System.out.println("enter the array elements");
		a[i]=sc.nextInt();
	}
		for(int x: a) {
			System.out.println(x);
		}
	}
}
