package paiza.D;

import java.util.Scanner;

public class paiza32 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int day = 0;
        while(A <= B){
            A += A * 0.1;
            day ++;
        }
        System.out.println(day);
        sc.close();
    }
}
