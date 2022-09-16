package paiza.output;

import java.util.Scanner;

public class output27 {

	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        if(t1 == t2){
            System.out.println(0);
        } else if(t1 > t2){
            System.out.println("-" + (t1 - t2));
        } else {
            System.out.println("+" + (t2 - t1));
        }
        sc.close();
    }

}
