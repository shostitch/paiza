package paiza.input;

import java.util.Scanner;


public class input3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i ++){
        	//N回繰り返す行の指定
            int M = sc.nextInt();
            // M繰り返す行に何個値を入れるのかあを決める
            for(int j = 0; j < M; j ++){
            	//
                int a = sc.nextInt();
                System.out.print(a);
                if(j < M -1){ //
                	System.out.print(" ");
                } else {
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}