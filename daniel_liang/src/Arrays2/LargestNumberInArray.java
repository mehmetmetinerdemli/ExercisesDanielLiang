package Arrays2;

import java.lang.reflect.Array;

public class LargestNumberInArray {
// finding largest number in an array using it's index
	public static int getLargest(int[] number, int total) {

		int forIndex = 0;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (number[i] > number[j]) {
					forIndex = number[i];
					number[i] = number[j];
					number[j] = forIndex;
				}
			}
		}

		return number[total - 1];

	}

	public static void main(String[] args) {

		System.out.println(getLargest(new int[] { 2, 25, 3, 6 }, 4));

	}

}
