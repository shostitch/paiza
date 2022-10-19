package paiza.double_loop;

import java.util.Scanner;

public class no5 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        int[][] nums = new int[n][k];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < k; j ++){
                nums[i][j] = sc.nextInt();
                sum += nums[i][j];
            }
            System.out.println(sum);
            sum = 0;
        }

        sc.close();
    }
}
