package paiza.D;

import java.util.Scanner;

public class paiza4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N != 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}
