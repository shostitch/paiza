package paiza.array;

import java.util.Scanner;

public class No19 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] nums = new int[M];
        int count = 0;
        for(int i = 0; i < nums.length; i ++){
            nums[i] = sc.nextInt();
            if(nums[i] == N){
                count ++;
            }
        }
        System.out.println(count);
    sc.close();
    }
}
