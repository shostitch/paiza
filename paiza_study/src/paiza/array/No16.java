package paiza.array;

import java.util.Scanner;

public class No16 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 自分の得意な言語で
        // Let's チャレンジ！！
        int N = sc.nextInt();
        int[] nums = new int[] {5, 12, 6, 84, 14, 25, 44, 3, 7, 20};
        for(int x : nums){
            if(x == N){
                System.out.println("Yes");
                sc.close();
                return;
            }
        }
    System.out.println("No");
    sc.close();
    }
}
