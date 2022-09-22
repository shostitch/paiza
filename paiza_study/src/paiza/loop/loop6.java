package paiza.loop;

import java.util.Scanner;

public class loop6 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        int an = 0;
        for(int i = 0; i < N; i ++){
            nums[i] = sc.nextInt();
            an += nums[i];
        }
        System.out.println(an);
        sc.close();
    }
}
