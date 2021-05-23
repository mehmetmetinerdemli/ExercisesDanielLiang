package daniel2;

public class WriteThePrimeNums {

	public static void main(String[] args) {
		int counterOfPrimeNumber = 0;
		int num = 2;
		while (counterOfPrimeNumber < 10000) {
			if (isPrime(num)) {
				System.out.printf("%8d", num); // with using format "%8d" orginized the order of nums

				counterOfPrimeNumber++;
				if (counterOfPrimeNumber % 20 == 0) { // after every 20 times writing passed the other line with println

					System.out.println();
				}
			}
			num++; // increased the num after the if statement inside the while loop
		}

	}

	public static boolean isPrime(int s) {
		for (int i = 2; i < s; i++) { // the smallest prime num is 2 that's why i = 2
			if (s % i == 0) {
				return false;
			}
		}
		return true;
	}
}
