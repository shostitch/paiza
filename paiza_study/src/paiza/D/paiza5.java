package paiza.D;

import java.util.Scanner;

public class paiza5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int nums[] = new int[num];
		for(int i = 0; i < nums.length; i ++) {
			int number = sc.nextInt();

			if(number == 0) {
				System.out.println("NO");
				sc.close();
				return;
			}
		}
		System.out.println("YES");
		sc.close();
	}
}
