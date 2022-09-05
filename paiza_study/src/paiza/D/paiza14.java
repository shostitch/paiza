package paiza.D;

import java.util.Scanner;

public class paiza14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		if(day == 1 || day % 7 == 0) {
			System.out.println("sun");
		} else if(day != 1 && day % 7 + 1 == 1) {
			System.out.println("mon");
		} else if(day != 1 && day % 7 + 1 == 2) {
			System.out.println("tue");
		} else if(day != 1 && day % 7 + 1 == 3) {
			System.out.println("wen");
		} else if(day != 1 && day % 7 + 1 == 4) {
			System.out.println("thu");
		} else if(day != 1 && day % 7 + 1 == 5) {
			System.out.println("fri");
		} else if(day != 1 && day % 7 + 1 == 6) {
			System.out.println("sat");
		}
		sc.close();
	}
}
