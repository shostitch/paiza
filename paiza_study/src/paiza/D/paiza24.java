package paiza.D;

import java.util.Scanner;

public class paiza24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int nums[] = new int[2];
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = sc.nextInt();
		}
		if(nums[0] < 0 && nums[1] < 0) {
			num = nums[1] * nums[1];
		} else if(nums[0] < 0 && nums[1] >= 0) {
			num = nums[0] * nums[1];
		} else if(nums[0] >= 0) {
			num = nums[0] * nums[0];
		}

		System.out.println(num);
		sc.close();
	}
}
