package paiza.double_loop;

import java.util.Scanner;

public class no9 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i ++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j ++){
                if(j != n - 1){
                    System.out.print((a[i]*a[j]) + " ");
                }else{
                    System.out.println(a[i]*a[j]);
                }
            }
        }
        sc.close();
    }
}
