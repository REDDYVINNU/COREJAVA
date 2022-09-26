package Choice_program;
class sportstheme{
	void cricket() {
		System.out.println("cricket is international game");
	}
	void rich (){
		System.out.println("IPL is national game in india");
	}
}
class football extends sportstheme{
	void cricket() {
		System.out.println("Dhoni is good player");
	}
	void rich() {
		System.out.println("Dhoni jersey no is 7");
	}
}
class videogame extends sportstheme{
	void cricket() {
		System.out.println("highest fan following is VIRAT KHOLI");
	}
	void rich() {
		System.out.println("Dhoni is the best wicket keeper");
	}
}
public class sports_with_hiererichical {
	public static void main(String[] args) {
		sportstheme sp = new sportstheme();
		sp.cricket();
		sp.rich();
		System.out.println("---------");
		sp=new football();
		sp.cricket();
		sp.rich();
		System.out.println("---------");
		sp=new videogame();
		sp.cricket();
		sp.rich();
	}
}
