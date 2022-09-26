package Assignment;

public class triangle_and_interest {

	public static void main(String[] args) {
		int breadth=20;
		int height=40;
		
		int principle=1000;
		int rate=8;
		int time=5;
		
		System.out.println("breadth of the triangle :"+breadth+"mm");
		System.out.println("height of the triangle :"+height+"mm");
		System.out.println("area of the triangle :"+0.5*(breadth*height));
		System.out.println();
		System.out.println("principle amount :"+principle);
		System.out.println("rate of interest :"+rate);
		System.out.println("duration :"+time+"year");
		System.out.println("simple interest :"+(principle*rate*time/100));
		
		

	}

}
