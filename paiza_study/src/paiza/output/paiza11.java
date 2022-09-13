package paiza.output;

import java.util.Scanner;

public class paiza11 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = N /2;
        for(int i= 1; i <= num; i++){
            if(i == num){
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }

        for(int i= 1; i <= N; i++){
            if(i > num){
                if(i == N){
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        sc.close();
    }
}
