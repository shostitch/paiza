package paiza.loop;

import java.util.Scanner;

public class loop14 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        int min = 100;
        for(int i = 0; i < N ; i++){
            nums[i] = sc.nextInt();
            if(nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println(min);
        sc.close();
    }
}
