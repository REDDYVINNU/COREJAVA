package Rohit_class;

class school{
	static class department{
		void prepare() {
			System.out.println("question paper");
		}
		static void announcement() {
			System.out.println("coming to exam");
		}
	}
}
public class static_inner_class {
	public static void main(String[] args) {
		school.department mech = new school.department();
		mech.prepare();
		school.department.announcement();
		}

}
