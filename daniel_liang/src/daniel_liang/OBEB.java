package daniel_liang;

import java.util.Scanner;

public class OBEB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first num");
		int num1 = scan.nextInt();
		System.out.println("enter the second num");
		int num2 = scan.nextInt();

		int obeb = 1;
		int bolen = 2;

		while (bolen <= num1 && bolen <= num2) {
			if (num1 % bolen == 0 && num2 % bolen == 0) {
				obeb = bolen;
			}
			bolen++;
		}
		
		System.out.println(obeb);
	}

}
