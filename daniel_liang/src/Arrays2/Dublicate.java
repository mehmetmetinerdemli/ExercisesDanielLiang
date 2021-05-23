package Arrays2;

public class Dublicate {

	// String -- Remove Duplicates
	// Write a return method that can remove the duplicated values from String
	// Ex: "AAABBBCCC" ==> ABC
	public static String RemoveDouble(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++)
			if (!result.contains("" + str.charAt(i)))
				result += "" + str.charAt(i);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(RemoveDouble("AAABBBCCCTABA"));
	}

}
