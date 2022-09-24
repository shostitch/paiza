package paiza.D;

import java.util.Scanner;

public class paiza35 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        int max = 0;
        for(int i = 0; i < N; i ++){
            nums[i] = sc.nextInt();
            if(max < nums[i] + i + 1){
                max = nums[i] + i + 1;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
