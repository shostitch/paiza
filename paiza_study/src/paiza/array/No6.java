package paiza.array;

import java.util.Scanner;

public class No6 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[] nums = new int[10];
        for(int i = 0; i < 10; i ++){
            nums[i] = sc.nextInt();
        }
        System.out.println(nums[K - 1]);
        sc.close();
    }
}
