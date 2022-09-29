package paiza.array;

import java.util.Scanner;

public class No29 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String[] line = new String[10];
        for(int i = 0; i < 10; i ++){
            line[i] = sc.next();
            System.out.println(line[i]);
        }
        sc.close();
    }
}
