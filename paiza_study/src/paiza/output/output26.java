package paiza.output;

import java.util.Scanner;

public class output26 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        for(int i = 0; i < line.length(); i ++){
            System.out.println(line.charAt(i));
        }
        sc.close();
    }
}
