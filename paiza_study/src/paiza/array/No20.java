package paiza.array;

import java.util.Scanner;

public class No20 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < nums.length; i ++){
            nums[i] = sc.nextInt();
            if(nums[i] == A ){
                nums[i] = B;
            }
            System.out.println(nums[i]);
        }
    sc.close();
    }
}
