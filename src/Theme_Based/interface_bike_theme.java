package Theme_Based;
interface motors{
	abstract void bike_price();
	abstract void bike_color();
	abstract void company();
}
abstract class motor implements motors{
	void fuel() {
		System.out.println("petrol engine");
	}
	void absorber() {
		System.out.println("single shock absorber");
	}
}
class ktm extends motor{
	public void bike_price() {
		System.out.println("ktm adventure bike price is 3.5lakhs");
	}
	public void bike_color() {
		System.out.println("ktm adventure bike color is orange and black");
	}
	public void company() {
		System.out.println("ktm company");
	}
}
class tigertriumph extends motor{
	public void bike_price() {
		System.out.println("tiger triumph bike price 13.70lakhs ");
	}
	public void bike_color() {
	System.out.println("tiger triumph bike color is graphite and diablo red");
	}
	public void company() {
		System.out.println("triumph motor cycles");
	}	
}
class ninja extends motor{
	public void bike_price() {
		System.out.println("kawaski ninja zx-10r bike price is 16lakhs");
	}
	public void bike_color() {
		System.out.println("bike color is lime green");
	}
	public void company() {
		System.out.println("kawaski motors");
	}
}
public class interface_bike_theme {
	public static void main(String[] args) {
		motor b = new ktm();
		b.bike_price();
		b.bike_color();
		b.company();
		b.fuel();
		b.absorber();
		System.out.println("%%%%%%%%%%%%%%%");
		b=new tigertriumph();
		b.bike_price();
		b.bike_color();
		b.company();
		b.fuel();
		b.absorber();
		System.out.println("%%%%%%%%%%%%%%");
		b=new ninja();
		b.bike_price();
		b.bike_price();
		b.company();
		b.fuel();
		b.absorber();
	}

}
