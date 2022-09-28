package paiza.array;

import java.util.Scanner;

public class No23 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < N; i ++){
            nums[i] = sc.nextInt();
            if(i >= A -1 && i <= B -1){
                System.out.println(nums[i]);
            }
        }
    sc.close();
    }
}
