package paiza.loop;

import java.util.Scanner;

public class loop18 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String[] a = new String[1000];
        for(;;){
            a[i] = sc.next();
            if(a[i].equals("EOF")){
            	// Stringは＝＝で繋がない
                System.out.println(a[i]);
                i++;
                sc.close();
                return;
            } else {
                System.out.println(a[i]);
                i++;
            }
        }
    }
}
