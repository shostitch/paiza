package paiza.output;

import java.util.Scanner;

public class paiza12 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i = 1; i <= N;i ++){
            if(i == N){
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
        for(int i = 1; i <= M;i ++){
            if(i == M){
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
