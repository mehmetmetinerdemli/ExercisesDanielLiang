package daniel_liang;

import java.util.Scanner;

public class SayiTahmini {

	public static void main(String[] args) {

		int number = (int) (Math.random() * 101);

		Scanner scan = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");

		int guess = scan.nextInt();
		while (guess != number) {

			if (guess < number) {
				System.out.println("Your guess is lower than the number ");

			} else {
				System.out.println("Your guess is higher than the number ");

			}
			System.out.println("\nEnter your guess: ");
			guess = scan.nextInt();
		}

		System.out.println("Yes, the number is " + number);

	}

}
