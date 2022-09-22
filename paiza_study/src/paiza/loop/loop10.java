package paiza.loop;

import java.util.Scanner;

public class loop10 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < N ; i ++){
            nums[i] = sc.nextInt();
        }
        for(int j = N -1; j >= 0; j--){//N - 1しないと配列は0から始まるのでN番目の値はない！
            System.out.println(nums[j]);
        }
        sc.close();
    }
}
