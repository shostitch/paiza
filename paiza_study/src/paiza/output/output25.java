package paiza.output;

import java.util.Scanner;

public class output25 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        Double N = sc.nextDouble();
        System.out.print((N - 18) + " " + (N - 18.5));
        //まとめて一つに！
//        System.out.print(N - 18);
//        System.out.print(" ");
//        System.out.print(N - 18.5);
        sc.close();
    }
}
