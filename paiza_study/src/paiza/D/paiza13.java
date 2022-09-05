package paiza.D;

import java.util.Scanner;

public class paiza13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int nums[] = new int[num];
		int odd = 0;
		int even = 0;
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = sc.nextInt();
			if(nums[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("偶数:" + even + " " + "奇数:" + odd);
		sc.close();
	}
}