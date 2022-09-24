package paiza.D;

import java.util.Scanner;

public class paiza30 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0; // 2で割ったあまり（答えとなる数値
        int b = 0; // 答え　　base10の位と一の位をたす100の位をたす
        int base = 1; //くらいを表す変数10倍ずつしていく
        while(N > 0){
            a = N % 2; //2のあまりを出力 1,10,100の順に
            b += a * base; // b に b(答えの値) + a(0か1の答えの数値)
            // * base(何桁目なのかloopするたびに10の位100の位に値がなりbの答えにたされる)
            N /= 2; // Nを2で割った数値に代入し直す
            base *= 10;
        }
        System.out.println(b);
        sc.close();
    }
}
