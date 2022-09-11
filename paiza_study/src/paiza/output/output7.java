package paiza.output;

import java.util.Scanner;

public class output7 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0; i < 10; i++){
            nums[i] = sc.nextInt();
            if(i == 9){
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + " | ");
            }
        }
        sc.close();
    }
}
