package paiza.D;

import java.util.Scanner;

public class paiza14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		if(day % 7 == 1) {
			System.out.println("Sun");
		} else if(day % 7 == 2) {
			System.out.println("Mon");
		} else if(day % 7 == 3) {
			System.out.println("Tue");
		} else if(day % 7 == 4) {
			System.out.println("Wed");
		} else if(day % 7 == 5) {
			System.out.println("Thu");
		} else if(day % 7 == 6) {
			System.out.println("Fri");
		} else{
			System.out.println("Sat");
		}
		sc.close();
	}
}
