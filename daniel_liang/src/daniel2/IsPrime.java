package daniel2;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("in : ");
		double num = scan.nextDouble();

		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;

				break;
			}
		}
		if (isPrime) {
			System.out.println("Prime");
		} else {
			System.out.println("that is not a prime number");

		}
	}
}
