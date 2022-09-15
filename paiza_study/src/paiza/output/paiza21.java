package paiza.output;

import java.util.Scanner;

public class paiza21 {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        for(int i = 0; i < H; i ++){
            for(int j = 0; j < W; j ++){
                System.out.print("(" + A + ", " + B + ")");
                if(j < W -1){
                    System.out.print(" | ");
                } else {
                    System.out.println();
                }
            }
            if(i < H -1){
                for(int j = 0; j < W * 6 + 3 * (W -1); j ++){
                System.out.print("=");
            }
                System.out.println();
            }
            
        }
        sc.close();
    }
}
