package paiza.D;

import java.util.Scanner;

public class paiza33 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = N - 1; i > 0; i-- ){
            N = N * i;
        }
        System.out.println(N);
        sc.close();
    }
}
