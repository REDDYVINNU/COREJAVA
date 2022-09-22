package Rohit_class;
class unversity{
	void announcement () {
		System.out.println("exams start from 1st oct");
		department mech = new department();
		mech.prepare();
	}
	class department{
		void prepare () {
			System.out.println("question paper takes 10days time ");
		}
	}
}

public class member_inner_class {

	public static void main(String[] args) {
		unversity jntuh = new unversity();
		jntuh.announcement();
		
	}

}
