package corejava;

class cars{
	void verna() {
		System.out.println("hyundai verna performance is good");
	}
}
class creta extends cars{
	void jeep() {
		System.out.println("mahindra jeep is very strong vechicle");
	}
}
class xuv extends creta{
	 void xuv300() {
		 System.out.println("mahindra symbol is osm");
	 }
}
public class multilevel_inheritance {
	public static void main(String[] args) {
		xuv m = new xuv();
		m.verna();
		m.jeep();
		m.xuv300();

	}

}
