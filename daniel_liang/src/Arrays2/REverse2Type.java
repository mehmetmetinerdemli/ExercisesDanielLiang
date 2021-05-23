package Arrays2;

public class REverse2Type {
	// String -- Reverse
	// Write a return method that can reverse String
	// Ex: "Name" ==> emaN
	public static String Rever(String str) {
		return new StringBuffer(str).reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(Rever("Reverse This"));
		System.out.println(ReverseIt("Time is about to finish"));
	}

	public static String ReverseIt(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--)
			reverse += "" + str.charAt(i);
		return reverse;
	}

}
