package paiza.output;

import java.util.Scanner;

public class paiza18 {
	 public static void main(String[] args) {
	        // 自分の得意な言語で
	    // Let's チャレンジ！！
	    Scanner sc = new Scanner(System.in);
	    int line = sc.nextInt();
	    System.out.println(String.format("%,3d",line));
	    // % 値入れて間まで区切り3桁の幅にする
	    //3のまえに0を入れると3桁以下の値の前に0がつく
	    System.out.println(String.format("%,03d",line));
	    sc.close();
	}
}
