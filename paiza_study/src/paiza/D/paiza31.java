package paiza.D;

import java.util.Scanner;

public class paiza31 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        while(N <= K){
            N += M;
            count ++;
        }
        System.out.println(count);
        sc.close();
    }
}
