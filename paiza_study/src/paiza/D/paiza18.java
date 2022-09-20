package paiza.D;

import java.util.Scanner;

public class paiza18 {
	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int nums1[] = new int[N];
//		int nums2[] = new int[N];
//		int count = 0;
//		for(int i = 0; i < N ; i ++) {
//			nums1[i] = sc.nextInt();
//			nums2[i] = sc.nextInt();
//			if(nums1[i] == nums2[i]) {
//				count++ ;
//			}
//		}
//		System.out.println(count);
//		sc.close();
		int N = sc.nextInt();
		int[] nums1 = new int[N];
		int[] nums2 = new int[N];
		int count = 0;
		for(int i = 0; i < N ; i ++) {
			nums1[i] = sc.nextInt();
		}
		for(int i = 0; i < N ; i ++) {
			nums2[i] = sc.nextInt();
		}
		for(int i = 0; i < N ; i ++) {
		    if(nums1[i] == nums2[i]){
			    count += 1;
		    }
		}
		System.out.println(count);
		sc.close();
		//一つ一つに代入しないとababababと数値を入れることになってしまう
	}
}
