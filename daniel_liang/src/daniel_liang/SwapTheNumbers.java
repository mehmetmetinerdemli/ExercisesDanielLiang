package daniel_liang;

import java.util.Scanner;

public class SwapTheNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number as an integer.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		if (num1 < num2) {
			int geciciKonteynir = num1;
			num1 = num2;
			num2 = geciciKonteynir;
			System.out.println(num1 + " >>>>>>>>>>>>>>>> " + num2);
		}

	}

}
