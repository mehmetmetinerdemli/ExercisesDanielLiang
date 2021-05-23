package daniel_liang;

import java.util.Scanner;

public class WhichDay {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a day ( for monday 1  for sunday 7");
		int day = scan.nextInt();
		
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Week day");
			break;
		case 6:
		case 7:
			System.out.println("Weekend");
			break;
		default:
			System.out.println("wrong input");
			
		}
	}

}
