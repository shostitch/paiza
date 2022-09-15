package paiza.output;

import java.util.Scanner;

public class output23 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        double s = sc.nextDouble();
        d *= 1000;
        s /= 100;
        if(d / s >= 10000){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sc.close();
    }
}
