package Rohit_class;

import java.util.Optional;

public class Optional_class {

	public static void main(String[] args) {
		String[] str=new String[10];
		str[0]="Durga";
		Optional<String> xx = Optional.ofNullable(str[1]);
		if(xx.isPresent()) {
			System.out.println(str[1].length());
		}
		else {
			System.out.println("String is null");
		}
		System.out.println("vinay");
		System.out.println("surendra");
		System.out.println("jithu");
	}

}
