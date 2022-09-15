package paiza.output;

import java.util.Scanner;

public class output24 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //next と nextLineの違いは取得する範囲が違う
        // next は空白までの取得！
        // nextLine は改行まで空白も受け取る！！！！
        System.out.println(s.replace(", maybe.","!!"));
    }
}
