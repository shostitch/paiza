package paiza.double_loop;

import java.util.Scanner;

public class no7 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < i + 1; j ++){
                if(j == i){
                    System.out.print(j +1);
                } else {
                    System.out.print(j +1 + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
