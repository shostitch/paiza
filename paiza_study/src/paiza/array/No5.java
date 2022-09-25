package paiza.array;

import java.util.Scanner;

public class No5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] nums = {1, 3, 5, 4, 6, 2, 1, 7, 1, 5};
        for(int i = 0; i < nums.length; i ++){
            if(A == i +1){
                System.out.print(nums[i]);
            }// System.out.println(a[k - 1]); これが早いかも
        }
        sc.close();
    }
}
