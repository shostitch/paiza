package paiza.array;

import java.util.Scanner;

public class No32 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        String[] line = new String[M];
        for(int i = 0; i < line.length; i ++){
            line[i] = sc.next();
        }
        for(int i = 0; i < line.length; i ++){
            if(i == N -1){
                for(int j = 0; j < line[i].length(); j ++){
                    if(j == L -1){
                        System.out.println(line[i].charAt(j));
                    }
                }
            }
        }
        sc.close();
    }
}
