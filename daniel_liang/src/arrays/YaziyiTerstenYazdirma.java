package arrays;

import java.util.Scanner;

public class YaziyiTerstenYazdirma {
	
	
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir yazi giriniz ");
		String yazi = scan.nextLine();
		char[] yaziDizisi = yazi.toCharArray();

		char[] yazininTersi = terseCevir(yaziDizisi);

		System.out.println("girdiginiz yazinin tersi: ");
		System.out.println(yazininTersi);

	}

	public static char[] terseCevir(char[] yaziDizisi) {

		char[] yazininTersi = new char[yaziDizisi.length];
		for (int i = 0, j = yazininTersi.length - 1; i < yazininTersi.length; i++, j--) {
			yazininTersi[j] = yaziDizisi[i];

		}

		return yazininTersi;
	}
}
