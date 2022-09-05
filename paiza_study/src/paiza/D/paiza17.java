package paiza.D;

import java.util.Scanner;

public class paiza17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[3];
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = sc.nextInt();
		}
		int N = nums[0];
		int A = nums[1];
		int B = nums[2];
		if(N + A + B == 0 || N + A - B == 0 || N - A + B == 0 || N - A - B == 0 ){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}
