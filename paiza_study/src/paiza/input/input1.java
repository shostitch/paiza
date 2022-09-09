package paiza.input;

import java.util.Scanner;


public class input1 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] nums = new int[N][3];
        for(int i = 0; i < N; i ++){
            for(int j = 0; j < 3; j ++){
                nums[i][j] = sc.nextInt();
                if(j == 2){
                    System.out.println(nums[i][j]);
                } else {
                    System.out.print(nums[i][j] + " ");
                }
            }
        }
        sc.close();
    }
}