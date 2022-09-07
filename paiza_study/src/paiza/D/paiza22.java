package paiza.D;

import java.util.Scanner;

public class paiza22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[3];
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = sc.nextInt();
		}
		
		if(nums[0] * nums[1] <= nums[2] + 0.1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		sc.close();
	}
}
