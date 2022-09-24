package paiza.D;

import java.util.Scanner;

public class paiza38 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= N; i ++){
            if(N % i == 0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
