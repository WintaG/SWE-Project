package lesson2;

public class Probelm1 {
	public static void main(String[] args) {
		final double PI = 3.147;
		int x = (int) (Math.random() * 8 + 1);
		int y = (int) (Math.random() * 11 + 3);
		System.out.println(Math.pow(PI, x));
		System.out.println(Math.pow(y, PI));
	}

}
