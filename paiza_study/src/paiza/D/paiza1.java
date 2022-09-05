package paiza.D;

import java.util.Scanner;

public class paiza1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String paiza = "paiza";

		if(paiza.equals(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
