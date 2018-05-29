package lesson2;

import java.util.Arrays;

public class Pro8 {
	public static void main(String[] args) {
		int[] array = { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22 };
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min);
	}
}
