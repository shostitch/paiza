package paiza.D;

import java.util.Scanner;

public class paiza23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[2];
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = sc.nextInt();
		}
		if(nums[0] % 2 == 0 && nums[1] % 2 == 0 && nums[0] != 0 && nums[1] != 0) {
			// 片方がゼロの時に破るとゼロになってしまうため！＝0が必要
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();

	}
}
