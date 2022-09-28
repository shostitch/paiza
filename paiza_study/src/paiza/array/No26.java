package paiza.array;

import java.util.Scanner;

public class No26 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < nums.length; i ++){
            nums[i] = sc.nextInt();
            if(i != M - 1){
                System.out.println(nums[i]);
            }
        }
        sc.close();
    }
}
