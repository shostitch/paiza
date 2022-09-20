package paiza.D;

import java.util.Scanner;

public class paiza20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[2];
		int count = 0;

		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		sc.close();
		while(nums[0] < nums[1]) {
			// ここで＝をつけると16 <= 16 になりもう一度処理が行われてしまい割り切れた時（2）一つカウントが増える
			nums[0] *= 2;
			count ++;
		}
		System.out.println(count);
	}
}
