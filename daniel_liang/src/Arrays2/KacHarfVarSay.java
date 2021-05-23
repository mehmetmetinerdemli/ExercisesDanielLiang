package Arrays2;

public class KacHarfVarSay {
	public static void main(String[] args) {
		System.out.println(getWord("aaabbbbbccccaaaa"));
	}

	public static String getWord(String word) {
		int count = 1;
		String ret = "";
		for (int i = 0; i < word.length() - 1; i++) {
			if (word.charAt(i) == word.charAt(i + 1)) {
				count++;
				continue;
			} else {
				ret = ret + word.charAt(i) + count;
			}
			count = 1;
		}
		ret = ret + word.charAt(word.length() - 1);
		return ret;

	}

}
