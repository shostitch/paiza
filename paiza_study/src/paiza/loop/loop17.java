package paiza.loop;

import java.util.Scanner;

public class loop17 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] a = new int[1000];
        for(;;){
            a[i] = sc.nextInt();
            if(a[i] == -1){
                System.out.println(a[i]);
                i++;
                sc.close();
                return;

            } else {
                System.out.println(a[i]);
                i++;
            }
        }
    }
}
