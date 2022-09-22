package paiza.loop;

import java.util.Scanner;

public class loop7 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < N; i ++){
            nums[i] = sc.nextInt();
            if(i + 1 >= A && i + 1 <= B){
                sum += nums[i];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
