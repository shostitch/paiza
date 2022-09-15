package paiza.output;

import java.util.Scanner;

public class output22 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W ; j++){
                System.out.printf("(%9d, %9d)", A , B);
                if(j == W -1){
                    System.out.println();
                } else {
                    System.out.print(" | ");
                }
                
            }
            if( i < H -1){
                for(int j = 0; j < W * 22 + 3 * (W - 1); j++){
                    System.out.print("=");
                }
                System.out.println();
            }
            
        }
        sc.close();
    }
}
