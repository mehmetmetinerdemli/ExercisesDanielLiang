package arrays;

public class LinerSearch {

	public static void main(String[] args) {

		int[] list = { 1, 2, 3, 4, 2, 5, -3, 6, 2 };

		int i = linearSearch(list, 4);// returns 3(index of 4 )

		int j = linearSearch(list, -4);// returns -1 did not find the -4

		int k = linearSearch(list, -3);// returns 6 ( index of 6 )

		System.out.println(i + " " + j + " " + k);

	}

	public static int linearSearch(int[] list, int key) {

		for (int i = 0; i < list.length; i++) {
			if (key == list[i]) {
				return i;
			}

		}

		return -1;

	}
}
