package corejava;
import java.util.Scanner;

 class sv1{
	String name;
	int eng_marks,tel_marks;
	Scanner sc = new Scanner(System.in);
	
	void person() {
		System.out.println("enter the student details");
		name = sc.nextLine();
		System.out.println("eng_marks");
		eng_marks = sc.nextInt();
		System.out.println("tel_marks");
		tel_marks=sc.nextInt();
	}
	void add() {
		System.out.println("total marks "+(eng_marks+tel_marks));
				}
 }
	 class adding extends sv1{
		 int hindi_marks;
		 void pr() {
			 System.out.println("hindi_marks");
			 hindi_marks=sc.nextInt();
			 System.out.println("supply exam is passed");
		 }
	 }
public class Owndate20{
	public static void main(String[] args) {
		adding ad = new adding();
		ad.person();
		ad.add();
		ad.pr();
	}
}
	 

