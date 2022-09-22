package paiza.loop;

import java.util.Scanner;

public class loop9 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            b[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            System.out.println(a[i] - b[i]);
        }
        sc.close();
    }
}
