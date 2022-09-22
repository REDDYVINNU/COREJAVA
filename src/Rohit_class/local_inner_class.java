package Rohit_class;
class college{
	void announcement() {
		System.out.println("exam start from 1st oct");
		class department{
			void prepare() {
				System.out.println("question paper taken 10days time");
			}
		}
		department mech1 = new department();
		mech1.prepare();
	}
}
public class local_inner_class {

	public static void main(String[] args) {
		college mech = new college();
		mech.announcement();
		

	}

}
