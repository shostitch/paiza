package paiza.array;

import java.util.Scanner;

public class No31 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] line = new String[5];
        for(int i = 0; i < line.length; i ++){
            line[i] = sc.next();
        }
        for(int i = 0; i < line.length; i ++){
            if(i == N -1){
                System.out.println(line[i]);
            }
        }
        sc.close();
    }
}
