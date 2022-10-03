package paiza.array;

import java.util.ArrayList;
import java.util.Scanner;

public class No40 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < N; i ++){
            nums.add(sc.nextInt());
        }

        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        double ave = (double) sum / N;

        for(int i = 0; i < N; i ++){
            if(ave <= nums.get(i)){
                System.out.println(nums.get(i));
            }
        }
        sc.close();
    }
}
