package paiza.D;

import java.util.Scanner;

public class paiza26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println(A * A + " " + (B * B + C * C));
        //出力の中で＋演算子を使うときは（）で括らないと、結合と間違えられる！！
        sc.close();
	}
}
