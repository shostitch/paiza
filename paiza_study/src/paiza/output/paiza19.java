package paiza.output;

import java.util.Scanner;

public class paiza19 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
            System.out.println(String.format("%," + M + "d", nums[i]));
        }
        sc.close();
    }
}
