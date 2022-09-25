package paiza.array;

import java.util.Scanner;

public class No18 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[] {1, 5, 9, 7, 3, 2, 4, 8, 6, 10};
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == N){
                System.out.println(i + 1);
            }
        }
    sc.close();
    }
}
