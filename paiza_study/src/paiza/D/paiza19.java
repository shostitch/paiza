package paiza.D;

import java.util.Scanner;

public class paiza19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int nums[] = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i ++) {
			nums[i] = sc.nextInt();
			if(nums[i] % 2 == 0) {
				sum += nums[i];
			} else {
				break;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
