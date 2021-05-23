package multi_dimensional_arrays;

public class AtmPassword {
	public static void main(String[] args) {

		//current password  1   81   77374
		//                   374  747
		//expected password 13748137477374
		System.out.println("Dear thieves, please don't steal my ATM card.");
		System.out.println("But if you do, here's my password: ");
		firstpart();
		secondpart();

		System.out.println("");

	}

	private static void firstpart() {
		System.out.print("1");

	}

	private static void secondpart() {
		System.out.print("8");
		firstpart();
		lucky();
		lastbit();
	}

	private static void lastbit() {
		System.out.print("3");
		lucky();
		System.out.print("4");
	}

	private static void lucky() {
		System.out.print("7");
	}

}
