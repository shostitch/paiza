package paiza.array;

import java.util.Scanner;

public class No13 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int[][] nums = new int[][] {{1,2,3,4},{10,100,0,5},{8,1,3,8},{15, 34, 94, 25}};
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i = 0; i < N; i ++){
            for(int j = 0; j < M; j ++){
                if(i == N-1 && j == M-1){
                    System.out.println(nums[i][j]);
                }
            }
        }
        sc.close();;
    }
}
