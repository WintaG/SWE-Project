package lesson3part2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter C for Circle, Enter T for Triangle ,Enter R for Rectangle");
		String str = input.nextLine();
		switch (str) {
		case "C":
			System.out.println("Enter radius ");
			double radius = input.nextDouble();
			Circle c = new Circle(radius);
			System.out.println(c.computeArea());
			break;
		case "T":
			System.out.println("Enter base ");
			double base = input.nextDouble();
			System.out.println("Enter Height");
			double height = input.nextDouble();
			Triangle t = new Triangle(base, height);
			System.out.println(t.computeArea());
			break;
		case "R":
			System.out.println("Enter width ");
			double width = input.nextDouble();
			System.out.println("Enter Height");
			double height2 = input.nextDouble();
			Rectangle r = new Rectangle(width, height2);
			System.out.println(r.computeArea());
			break;
		}
		input.close();
	}
}