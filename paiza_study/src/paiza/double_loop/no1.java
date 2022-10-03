package paiza.double_loop;

import java.util.Scanner;

public class no1 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                if(j == n - 1){
                    System.out.println(j + 1);
                } else {
                    System.out.print(j + 1 + " ");
                }

            }
        }
        sc.close();
    }
}
