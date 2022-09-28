package paiza.array;

import java.util.Scanner;

public class No22 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int M = 0;
        int O = 0;
        int[] nums = new int[N];
        for(int i = 0; i < N; i ++){
            nums[i] = sc.nextInt();
            if(i == A -1){
                M = nums[i];
            }
            if(i == B -1){
                O = nums[i];
            }

        }
        for(int i = 0; i < N; i ++){
            if(i == A -1){
                nums[i] = O;
            } else if(i == B -1){
                nums[i] = M;
            }
            System.out.println(nums[i]);
        }
    sc.close();
    }
}
