package corejava;

public class bank {
	void application_form(){
		System.out.println("first_name:__________");
		System.out.println("last_nmae:_________");
		System.out.println("DOB: __ __ __" );
	}
	void details(long adhar_no,long mobile_no) {
		System.out.println("adhar no :"+adhar_no);
		System.out.println("mobile no :"+mobile_no);
	}
	String passbook(){
		return "passbook";
	}
	String deposit(int amount) {
		System.out.println("amount gives "+amount);
		return "your total amount ="+amount+" successfully deposited";	
	}

	public static void main(String[] args) {
		bank sv = new bank();
		sv.application_form();
		sv.details(456478949874l,9040705010l);
		System.out.println("bank gives "+sv.passbook());
		System.out.println(sv.deposit(15000));
		

	}

}
