package paiza.loop;

import java.util.Scanner;

public class loop20 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        
        while (N != 0) {

            sum += N % 10;

            N /= 10;
        }

        System.out.println(sum);
        sc.close();
    }
}
