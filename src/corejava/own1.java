package corejava;

public class own1 {
	void application(){
		System.out.println("---download the phonepay---");
	}
	void details(long mobile_no) {
		System.out.println("register the mobile no "+mobile_no);
	}
	String otp() {
		return "OTP is send the registerd mobile no";
	}
	String selectbank(String name) {
		System.out.println("selected bank :"+name);
		return "active the @ybl";
	}
	public static void main(String[] args) {
		own1 app = new own1();
		app.application();
		app.details(9787478788l);
		System.out.println(app.otp());
		System.out.println(app.selectbank("SBI"));

	}

}
