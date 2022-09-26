package Assignment;
interface vechicle{
	abstract void top_speed();
	abstract void engine_capacity();
	abstract void car_name();
}
abstract class car implements vechicle{
	void sun_roff() {
		System.out.println("every car has sun roff");
	}
	void lights() {
		System.out.println("every car has LED lights ");
	}
	void range() {
		System.out.println("luxury car");
	}
}
class bentely extends car{
	public void top_speed() {
		System.out.println("bentely top speed is 208km ");
	}
	public void engine_capacity() {
		System.out.println("bentely engine capacity is 5950CC");
	}
	public void car_name() {
	System.out.println("________bentely__________");
	}
}
class porsche extends car{
	public void car_name() {
		System.out.println("______porsche 911_____");
	}
	public void top_speed() {
		System.out.println("porsche top speed is 198km");
	}
	public void engine_capacity() {
		System.out.println("porsche engine cpapcity is 3996CC");
	}
}
class jaguar extends car{
	public void top_speed() {
		System.out.println("jaguar top speed is 155mph");
	}
	public void engine_capacity() {
		System.out.println("jaguar engine capacity is 1997CC");
	}
	public void car_name() {
		System.out.println("_____jaguar_____");
	}
}
public class Interface_using_car {
	public static void main(String[] args) {
		car v ;
		v= new bentely();
		v.car_name();
		v.top_speed();
		v.engine_capacity();
		v.sun_roff();
		v.range();
		v.lights();
		System.out.println("*********************");
		v = new porsche();
		v.car_name();
		v.top_speed();
		v.engine_capacity();
		v.sun_roff();
		v.range();
		v.lights();
		System.out.println("*********************");
		v=new jaguar();
		v.car_name();
		v.engine_capacity();
		v.top_speed();
		v.sun_roff();
		v.range();
		v.lights();
	}
}
