package paiza.output;

import java.util.Scanner;

public class paiza15 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int M = sc.nextInt();
        int[] b = new int[M];
        for(int i = 0;i < N; i ++){
            a[i] = sc.nextInt();
        }
        for(int j = 0;j < M; j ++){
            b[j] = sc.nextInt();
        }
        // それぞれ幾つの値を幾つに分割するのか出力させる

        int nextInt = 0;//値を一つづつ取り出すために、インデックス0から取れるように
        // 0を代入して、ループの中で　+= 1　を使って一つづつ配列として代入していく
        // int型x に 配列bを一つづつ代入させながらbの数だけループを行う
        for(int x : b){
            for(int i = 0; i < x; i ++){
                System.out.print(a[nextInt]);
                if(i == x - 1){
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
                nextInt += 1;// 次の配列に行くために1を足す
            }
        }
        sc.close();
    }
}
