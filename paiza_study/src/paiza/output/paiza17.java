package paiza.output;

import java.util.Scanner;

public class paiza17 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        Double N = sc.nextDouble();
        int M = sc.nextInt();
        System.out.println(String.format("%." + M + "f",N));
        sc.close();
    }
}
