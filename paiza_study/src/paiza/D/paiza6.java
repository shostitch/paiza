package paiza.D;

import java.util.Scanner;

public class paiza6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[2];
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = sc.nextInt();
			if(nums[i] < 10) {
				System.out.println("NO");
				sc.close();
				return;
			}
		}
		System.out.println("YES");
		sc.close();
	}
}
