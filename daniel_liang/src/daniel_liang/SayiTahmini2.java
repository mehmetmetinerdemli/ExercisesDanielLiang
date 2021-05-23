package daniel_liang;

import java.util.Scanner;

public class SayiTahmini2 {

	public static void main(String[] args) {

		int number = (int) (Math.random() * 101);

		Scanner scan = new Scanner(System.in);

		int guess = -1;
		while (guess != number) {
			System.out.println("Guess a magic number between 0 and 100");
			guess = scan.nextInt();

			if (guess == number) {
				System.out.println("Yes, the number is " + number);
			} else if (guess < number) {
				System.out.println("Your guess is lower than the number ");

			} else {
				System.out.println("Your guess is higher than the number ");

			}

		}

	}

}
