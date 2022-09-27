package paiza.array;

import java.util.Scanner;

public class No15 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int L = sc.nextInt();

        int[][] nums = new int[N][M];
        for(int i = 0; i < N; i ++){
            for(int j = 0; j < M; j ++){
                nums[i][j] = sc.nextInt();
                if(i == K-1 && j == L-1){
                    System.out.print(nums[i][j]);

                }
            }
        }
        sc.close();
    }
}
