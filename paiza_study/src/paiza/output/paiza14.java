package paiza.output;

import java.util.Scanner;

public class paiza14 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i ++){
            nums[i] = sc.nextInt();
            for(int j = 1; j <= nums[i]; j ++){
                if(j == nums[i]){
                    System.out.println(j);
                } else {
                    System.out.print(j + " ");
                }
            }
        }
        sc.close();
	}
}
