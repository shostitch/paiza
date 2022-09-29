package paiza.array;

import java.util.Scanner;

public class No30 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] line = new String[]{"good","morning","paiza","813","pa13"};
        for(int i = 0; i < line.length; i ++){
            if(i == N -1){
                System.out.println(line[i]);
            }
        }
        sc.close();
    }
}
