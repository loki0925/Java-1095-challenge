package java_day4;

public class day_5 {

	public static void main(String a[]) {

		Computer obj = new Computer();

		obj.getMeApen(10);
		obj.playMusic();
		
		Caclulator obj2 = new Caclulator();
		int ans = obj2.add(3, 3);
		System.out.println(ans);
	}
}

class Computer {

	public void playMusic() {

		System.out.println("Play music");
	}

	public String getMeApen(int cost) {
		if (cost >= 10)
			return "pen";

		return "nothing";
	}

}
class Caclulator{
	//method overLoading
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a , int b, int c) {
		return a+b+c;
		
	}
	//stack memrory
}