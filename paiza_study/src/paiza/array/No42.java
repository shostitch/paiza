package paiza.array;

import java.util.Scanner;

public class No42 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for(int i = 0; i < N; i ++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        System.out.println(Math.abs(x[b - 1] - x[a - 1]) + Math.abs(y[b - 1] - y[a - 1]));
        //x配列の　A番目の値ーB番目の値　＋　配列の　A番目の値ーB番目の値
        sc.close();
    }
}
