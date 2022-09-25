package paiza.array;

import java.util.Scanner;

public class No14 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int[][] nums = new int[3][3];
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j ++){
                nums[i][j] = sc.nextInt();
                if(i == N-1 && j == M-1){
                    System.out.println(nums[i][j]);
                }
            }
        }
        sc.close();;
    }
}
