package paiza.double_loop;

import java.util.Scanner;

public class no12 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 24 ; i ++){
            for(int j = 0; j < 60; j ++){
                int num = i+j;
                if(num%15 == 0){
                    System.out.println("FIZZBUZZ");
                }else if(num%5 == 0){
                    System.out.println("BUZZ");
                }else if(num%3 == 0){
                    System.out.println("FIZZ");
                }else{
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
