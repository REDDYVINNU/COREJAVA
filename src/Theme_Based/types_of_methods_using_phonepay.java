package Theme_Based;

public class types_of_methods_using_phonepay {
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
		types_of_methods_using_phonepay app = new types_of_methods_using_phonepay();
		app.application();
		app.details(9787478788l);
		System.out.println(app.otp());
		System.out.println(app.selectbank("SBI"));

	}

}
