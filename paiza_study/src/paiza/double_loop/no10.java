package paiza.double_loop;

import java.util.Scanner;

public class no10 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u=0;

        loop:
        for(int i = 2 ;i <= n; i++){
            for(int j = 2;j < i; j++){ // 2 はj＜iが成り立たないからu++だけされる
            	if(i % j == 0)continue loop; // 4は2の時成り立つから上に戻される
            }
            u++;
        }

        System.out.println(u);
        sc.close();
    }
}
