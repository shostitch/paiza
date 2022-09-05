package paiza.D;

import java.util.Scanner;

public class paiza7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Cc = sc.next();
		if(Cc.toLowerCase().equals(Cc)) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		} 
		sc.close();
	}
}
