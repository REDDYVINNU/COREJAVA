package corejava;

interface Event{
	 void start();
}
interface sport{
	void play();
}
interface cricket extends Event,sport{
	void show();
}
public class Interface {
	public static void main(String[] args) {
		cricket c = new cricket() {
		public void start() {
			System.out.println("start the event");
		}
		public void play() {
			System.out.println("play the game");
		}
		public void show() {
			System.out.println("show the cricket");
			
		}

	};
	c.start();
	c.play();
	c.show();
}
}
