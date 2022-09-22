package paiza.loop;

import java.util.Scanner;

public class loop11 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i < 10; i ++){
            if(i == 9){
                System.out.println(8 * i);
            } else {
                System.out.print(8 * i + " ");
            }
        }
        sc.close();
    }
}
