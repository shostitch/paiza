package paiza.loop;

import java.util.Scanner;

public class loop12 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i < 10; i ++){
            if(i == 9){
                System.out.println(N * i);
            } else {
                System.out.print(N * i + " ");
            }
        }
        sc.close();
    }
}
