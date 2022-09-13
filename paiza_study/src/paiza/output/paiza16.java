package paiza.output;

import java.util.Scanner;

public class paiza16 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        Double N = sc.nextDouble();
        System.out.println(String.format("%.3f",N));
        // String.format("出力の方法",その変数とか)
        // 今回は　ストリング型にしてフォーマットを使い、%に値が入り、
        //ドットの後の3fで4桁目の四捨五入を行なって3桁に収める
        sc.close();
    }
}
