package lesson2;

import java.util.Scanner;

public class prob4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Input String");
		String str = input.nextLine();
		for(int i= str.length()-1; i>= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}
}
