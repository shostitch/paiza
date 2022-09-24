package paiza.D;

import java.util.Scanner;

public class paiza34 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count_zero = 0;
        while(N > 0) {
        	count_zero += N / 5;
    		N /= 5;
        }
        System.out.print(count_zero);
        sc.close();
    }
}
