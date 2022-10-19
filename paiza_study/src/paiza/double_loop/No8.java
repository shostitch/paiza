package paiza.double_loop;

import java.util.Scanner;

public class No8 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[k];
        int ans = -10000;
        for(int i = 0; i < n; i ++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < k; i ++){
            b[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                if(ans < a[i]*b[j]){
                    ans = a[i]*b[j];
                }
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
