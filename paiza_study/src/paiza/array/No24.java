package paiza.array;

import java.util.Scanner;

public class No24 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int M = sc.nextInt();
        int[] b = new int[M];
        for(int i = 0; i < N; i ++){
            a[i] = sc.nextInt();
            System.out.println(a[i]);
        }
        for(int i = 0; i < M; i ++){
            b[i] = sc.nextInt();
            System.out.println(b[i]);
        }
        sc.close();
    }
}
