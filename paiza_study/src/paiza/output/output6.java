package paiza.output;

import java.util.Scanner;

public class output6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 自分の得意な言語で
        // Let's チャレンジ！！
        int N = sc.nextInt();
//        switch(N){
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(1);
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(1);
//                System.out.println(2);
//                System.out.println(3);
//                break;
//            case 4:
//                System.out.println(1);
//                System.out.println(2);
//                System.out.println(3);
//                System.out.println(4);
//                break;
//            case 5:
//                System.out.println(1);
//                System.out.println(2);
//                System.out.println(3);
//                System.out.println(4);
//                System.out.println(5);
//                break;
        //}// なんか同じことたくさん書いている！

        if(N >= 1) {
        	System.out.println(1);
        }
        if(N >= 2) {
        	System.out.println(2);
        }
        if(N >= 3) {
        	System.out.println(3);
        }
        if(N >= 4) {
        	System.out.println(4);
        }
        if(N >= 5) {
        	System.out.println(5);
        }
        //こうすれば1より大きければ毎回1が出力される！

//        int n = sc.nextInt();
//        for (int i = 1; i < n + 1; i++) {
//          System.out.println(i);
//        }
        sc.close();
	}
}
