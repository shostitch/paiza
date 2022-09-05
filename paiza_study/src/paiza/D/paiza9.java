package paiza.D;

import java.util.Scanner;

public class paiza9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num >= 1 && num <= 20) {
			if(num <= 10) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("1~20で選択してください");
		}

		sc.close();
	}
}
