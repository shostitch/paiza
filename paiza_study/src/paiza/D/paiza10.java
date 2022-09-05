package paiza.D;

import java.util.Scanner;

public class paiza10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[3];
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = sc.nextInt();
		}
		if(nums[2] >= 10) {
			System.out.println("YES");
		} else if(nums[0] >= 10 && nums[1] >= 10) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}
