package paiza.output;

import java.util.Scanner;

public class paiza13 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i ++){
            for(int j = 1; j <= i; j++){
                if(j == i){
                    System.out.println(j);
                } else {
                    System.out.print(j + " ");
                }
            }
        }
        sc.close();
    }
}
