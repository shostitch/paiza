package paiza.D;

import java.util.Scanner;

public class paiza27 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = 10000;
        int A = sc.nextInt();
        int B = sc.nextInt();
        N /= A;
        N %= B;
        System.out.println(N);
        sc.close();
    }
}
