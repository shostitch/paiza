package paiza.double_loop;

import java.util.Scanner;

public class no3 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] nums = new int[n][k];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < k; j ++){
                nums[i][j] = sc.nextInt();
                if(nums[i][j] == 1){
                    System.out.println((i+1) + " " + (j+1));
                }
            }
        }
        sc.close();
    }
}
