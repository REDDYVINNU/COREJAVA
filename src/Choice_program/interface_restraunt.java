package Choice_program;

interface Restraunt{
	abstract void cost();
	abstract void quality();
}
abstract class Food implements Restraunt{
	void night() {
		System.out.println("night time available items");
		System.out.println(" 1.biriyani \n 2.chicken 65 \n 3.Dam biriyani  ");
	}
	void items() {
		System.out.println("restraunt have different items are available");
	}
	void mrng() {
		System.out.println("morning time is available only these items");
		System.out.println(" 1.idly = 40/- \n 2.dosa = 75/- \n 3.Bonda = 50/- \n 4.vada = 50/- \n 5.poori = 45/-");
	}
}
class Idly extends Food{
	public void cost() {
		System.out.println("idly cost is 50/- per plate");
	}
	public void quality() {
		System.out.println("item is very good");
	}
}
class Dosa extends Food{
	public void cost() {
		System.out.println("Dosa cost is 75/- per plate");
	}
	public void quality() {
		System.out.println("item is very good and very tasty");
	}
}
public class interface_restraunt {
	public static void main(String[] args) {
		Food r = new Idly();
		r.mrng();
		System.out.println(" ");
		r.cost();r.quality();r.items();
		System.out.println("******************");
		r = new Dosa();
		r.cost();r.quality();r.items();
		System.out.println("******************");
		r.night();
		

	}

}
