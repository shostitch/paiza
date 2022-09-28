package paiza.array;

import java.util.Scanner;

public class No21 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = 0;
        N = A;
        A = B;
        B = N;

        System.out.println(A + " " + B);


    sc.close();
    }
}
