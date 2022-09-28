package paiza.array;

import java.util.Arrays;
import java.util.Scanner;

public class No25 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i ++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < N; i ++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}
