package paiza.array;

import java.util.Scanner;

public class No11 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] nums = new int[5][N];
        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < nums[0].length; j ++){
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
