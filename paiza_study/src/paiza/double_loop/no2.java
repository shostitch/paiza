package paiza.double_loop;

import java.util.Scanner;

public class no2 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ms = new int[m];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                ms[j] = sc.nextInt();
                if(j == m-1){
                    System.out.println(ms[j]);
                } else {
                    System.out.print(ms[j] + " ");
                }

            }
        }
        sc.close();
    }
}
