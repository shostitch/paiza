package paiza.array;

import java.util.Scanner;

public class No43 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        int sum = 0;
        for(int i = 0; i < N; i ++){
            sum = a + b;
            if(i == 0){
                System.out.println(a);
            } else if(i == 1){
                System.out.println(b);
            } else {
                System.out.println(sum);
                c = a;
                a = b;
                b = c + a;
                // フィボナッチ数（前二つの値を足していく）
            }
        }
        sc.close();
    }
}
