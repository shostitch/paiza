package paiza.double_loop;

import java.util.Scanner;

public class no11 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n ; i ++){
            int now = i;
            while(now % 2 == 0){
                now /= 2;
                count ++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
