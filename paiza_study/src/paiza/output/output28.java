package paiza.output;

import java.util.Scanner;

public class output28 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.equals("B")){
            System.out.println("2");
        } else if(s.equals("A") || s.equals("D") || s.equals("O") || s.equals("P") || s.equals("Q") || s.equals("R")){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        sc.close();
    }
}
