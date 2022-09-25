package paiza.array;

import java.util.Scanner;

public class No12 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] nums = new int[N][5];
        for(int i = 0; i < N; i ++){
            for(int j = 0; j < 5; j ++){
                nums[i][j] = sc.nextInt();
                if(j < nums[0].length -1){
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.println(nums[i][j]);
                }
            }
        }
        sc.close();
    }
}
