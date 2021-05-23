package daniel_liang;

import java.util.Scanner;

public class SomethingWithStrings {

	public static void main(String[] args) {

		String s = "something";
		String s2 = "withString ";
		boolean b = s.equals(s2.trim()); // trim deletes the gaps before and after the strings
		if (b == true) { // just b is enough but this is more readable
			System.out.println("they are same");

		} else { 
			System.out.println("they are not same");
		}
		// -1 0 +1 .compareTo -1 = small =1 big 0=equal
		// karakterlerin numarasina (ascii tablosu) gore siraliyor
		s = "java";
		s2 = "Java";
		int compareValue = s.compareTo(s2); // degisken olusturduk cunku tekrar tekrar compareTo methodunu cagirmaya
											// gerek kalmiyor
		if (compareValue == 0) {
			System.out.println("equal");
		} else if (compareValue > 0) {
			System.out.println(s + " is greater than " + s2);
		} else {
			System.out.println(s + " is less than " + s2);
		}

//		s = "java";
//		s2 = "Java";
//		int compareValue = s.compareToIgnoreCase(s2); 
//		if(compareValue == 0) {
//			System.out.println("equal");
//		}else if (compareValue > 0) {
//			System.out.println(s + " is greater than " + s2);
//		}else {
//			System.out.println(s + " is less than " + s2);
//		}
//		
		// startswith , endsWith =====>>>
		System.out.println("Welcome to java".startsWith("we"));
		System.out.println("Welcome to java".endsWith("we"));

		// contains bir sey iceriyor mu icermiyor mu
		System.out.println("merhaba anne".contains("merhaba")); // true doner cunku merhaba iceriyor.

		Scanner scan = new Scanner(System.in);
		System.out.println("bir sehir girin");
		String sehir1 = scan.next();
		System.out.println("bir sehir daha girin");
		String sehir2 = scan.next();

		if (sehir1.compareToIgnoreCase(sehir2) < 0) {
			System.out.println("sehirleri sirali sekilde yazdiriyoruz : " + sehir1 + " " + sehir2);

		} else {
			System.out.println("sehirleri sirali sekilde yazdiriyoruz : " + sehir2 + " " + sehir1);
		}
		// substring ====>> stringin icinden bir parcayi alir COK KULLANILIR
		String str = "merhaba anne";
		System.out.println(str.substring(7, 9)); // istedigimiz parcayi aliriz 7 ile 9 arasi ya da sadece 7 yazsak 7 den
													// sonrasini alir

		System.out.println(str.replaceAll("haba", "gurkan")); // haba gordugu yere gurkan yazar ( ama str nin degeri
																// degismez str yine merhaba annedir sadece bu syso nun
																// icinde haba gurkan olarak kalir.
		System.out.println(str); // burda goruldugu gibi str hala ayni

		System.out.println(str.indexOf('h')); // .indexOf('m' , 4) 4 ve 4ten sonraki ilk m yi bulur
		System.out.println(str.lastIndexOf("ha", 4)); // eger arattigimiz seyi bulamazsa -1 verir donut olarak
		// "haba" string arar buldugu indexi yazar(sayisini) , "haba" , 5 5.indexten
		// sonraki haba yi bulur.
		// lastIndexOf aramaya sondan basla

		// isim soyisimi ayirmak istersem ===>
		String ss = "metin erdemli";
		int k = ss.indexOf(" ");
		String firstName = ss.substring(0, k);
		String lastName = ss.substring(k + 1);
		System.out.println(firstName);
		System.out.println(lastName);
		
		//Stringde yazan numarayi integera cevirme Integer.ParsInt    double a cevirme  Double.ParsDouble
		String sttr = "12345";
		int i = Integer.parseInt(sttr);
		System.out.println(i);
		
		
		
		
		
		
		
		
		
	}

}
